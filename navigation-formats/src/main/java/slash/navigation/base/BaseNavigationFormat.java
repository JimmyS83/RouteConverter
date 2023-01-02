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

package slash.navigation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.prefs.Preferences;

import static java.lang.Integer.MAX_VALUE;
import static slash.common.io.Transfer.trim;
import static slash.common.io.Transfer.trimLineFeeds;

/**
 * The base of all navigation formats.
 *
 * @author Christian Pesch
 */

public abstract class BaseNavigationFormat<R extends BaseRoute> implements NavigationFormat<R> {
    private static final Preferences preferences = Preferences.userNodeForPackage(BaseNavigationFormat.class);
    protected static final String GENERATED_BY = "Generated by Christian Peschs RouteConverter. Sees http://www.routeconverter.com";
    protected static final int UNLIMITED_MAXIMUM_POSITION_COUNT = MAX_VALUE;

    protected String getCreator() {
        return "RouteConverter " + System.getProperty("rest", "2.26") ;
    }

    protected List<String> asDescription(String string) {
        if (string == null || string.length() == 0)
            return null;
        List<String> strings = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(string, ",\n");
        while (tokenizer.hasMoreTokens()) {
            strings.add(tokenizer.nextToken().trim());
        }
        return strings;
    }

    protected String asDescription(String name, String description) {
        if (name == null && description == null)
            return null;
        if (description == null)
            return trimLineFeeds(name);
        if (name == null || description.startsWith(name))
            return trimLineFeeds(description);
        if (name.startsWith(description) || name.endsWith(description))
            return name;
        return trimLineFeeds(name + "; " + description);
    }

    public static String asName(String description) {
        if (description == null)
            return null;
        int index = description.indexOf(';');
        if (index != -1)
            description = description.substring(0, index);
        return trim(description);
    }

    protected String asName(String description, String defaultValue) {
        String result = asName(description);
        if (result == null)
            result = trim(defaultValue);
        return result;
    }

    public static String asDesc(String description) {
        if (description == null)
            return null;
        int index = description.indexOf(';');
        if (index != -1) {
            description = description.substring(index + 1);
            return trim(description);
        } else
            return null;
    }

    protected String asDesc(String description, String defaultValue) {
        String result = asDesc(description);
        if (result == null)
            result = trim(defaultValue);
        return result;
    }

    protected String asRouteName(String name) {
        return trim(name, getMaximumRouteNameLength());
    }

    public boolean isSupportsReading() {
        return true;
    }

    public boolean isSupportsWriting() {
        return true;
    }

    public int getMaximumFileNameLength() {
        return preferences.getInt("maximumFileNameLength", 64);
    }

    public int getMaximumRouteNameLength() {
        return preferences.getInt("maximumRouteNameLength", 64);
    }

    public int hashCode() {
        return getClass().getName().hashCode();
    }

    public boolean equals(Object obj) {
        return obj != null && getClass().equals(obj.getClass());
    }
}
