/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/
package slash.navigation.download.performer;

import slash.navigation.download.Action;
import slash.navigation.download.Download;
import slash.navigation.download.executor.DownloadExecutor;
import slash.navigation.rest.Get;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import static java.lang.String.format;
import static java.util.logging.Logger.getLogger;
import static slash.common.io.Files.setLastModified;
import static slash.common.io.Files.writePartialFile;
import static slash.common.io.InputOutput.copyAndClose;
import static slash.navigation.download.performer.GetPerformer.updateDownload;

/**
 * What the {@link DownloadExecutor} performs for {@link Action#GetRange}.
 */
public class GetRangePerformer implements ActionPerformer {
    private static final Logger log = getLogger(GetRangePerformer.class.getName());
    private static final long RANGE_END_INDEX = 16 * 1024L -1;

    private DownloadExecutor downloadExecutor;

    public void setDownloadExecutor(DownloadExecutor downloadExecutor) {
        this.downloadExecutor = downloadExecutor;
    }

    private Download getDownload() {
        return downloadExecutor.getDownload();
    }

    public void run() throws IOException {
        Get request = new Get(getDownload().getUrl());
        request.setRange(0L, RANGE_END_INDEX);
        if (getDownload().getETag() != null)
            request.setIfNoneMatch(getDownload().getETag());

        log.info(format("GET 0-%d for %s returned with status code %s and content length %d", RANGE_END_INDEX, getDownload().getUrl(), request.getStatusCode(), request.getContentLength()));
        if (request.isPartialContent()) {
            try(InputStream inputStream = request.executeAsStream()) {
                writePartialFile(inputStream, getDownload().getFile().getExpectedChecksum().getContentLength(), getDownload().getFile().getFile());
            }
        } else if (request.isOk()){
            // HTTP Range not supported
            copyAndClose(request.executeAsStream(), new FileOutputStream(getDownload().getFile().getFile()));
            setLastModified(getDownload().getFile().getFile(), request.getLastModified());
        }
        request.release();

        if (request.isNotModified()) {
            updateDownload(getDownload(), request);
            downloadExecutor.notModified();

        } else if (request.isSuccessful()) {
            updateDownload(getDownload(), request);
            downloadExecutor.succeeded();

        } else
            downloadExecutor.downloadFailed();
    }
}
