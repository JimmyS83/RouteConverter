package slash.navigation.maps.mapsforge.mbtiles;

import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.model.Tile;

import java.io.InputStream;
import java.util.logging.Logger;

class DatabaseRenderer {
    private static final Logger LOGGER = Logger.getLogger(DatabaseRenderer.class.getName());

    private final MBTilesFile file;
    private final GraphicFactory graphicFactory;
    private final long timestamp;

    DatabaseRenderer(MBTilesFile file, GraphicFactory graphicFactory) {
        this.file = file;
        this.graphicFactory = graphicFactory;
        this.timestamp = System.currentTimeMillis();
    }

    void close() {
        file.close();
    }

    /**
     * Called when a job needs to be executed.
     *
     * @param rendererJob the job that should be executed.
     */
    public TileBitmap executeJob(RendererJob rendererJob) {
        try {
            InputStream inputStream = file.getTileAsBytes(rendererJob.tile.tileX, rendererJob.tile.tileY, rendererJob.tile.zoomLevel);
            TileBitmap bitmap = inputStream != null ? this.graphicFactory.createTileBitmap(inputStream, rendererJob.tile.tileSize, rendererJob.hasAlpha) :
                    this.graphicFactory.createTileBitmap(rendererJob.tile.tileSize, rendererJob.hasAlpha);
            bitmap.setTimestamp(rendererJob.databaseRenderer.getDataTimestamp(rendererJob.tile));
            return bitmap;
        } catch (Exception e) {
            LOGGER.warning("Exception: " + e.getMessage());
            return null;
        }
    }

    public long getDataTimestamp(Tile tile) {
        return timestamp;
    }
}
