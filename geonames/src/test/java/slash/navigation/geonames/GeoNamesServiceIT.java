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
package slash.navigation.geonames;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeoNamesServiceIT {
    private GeoNamesService service = new GeoNamesService();

    @Test
    public void testAsterGDEMElevationFor() throws IOException {
        assertEquals(205, service.getAsterGDEMElevationFor(10.2, 50.001).intValue());
        assertEquals(2066, service.getAsterGDEMElevationFor(11.06561, 47.42428).intValue());
        assertEquals(null, service.getAsterGDEMElevationFor(0.0, 0.0));

        assertEquals(null, service.getAsterGDEMElevationFor(18.0, 82.0));
        assertEquals(null, service.getAsterGDEMElevationFor(28.0, 83.0));
        assertEquals(null, service.getAsterGDEMElevationFor(38.0, 84.0));

        assertEquals(null, service.getAsterGDEMElevationFor(48.0, -63.0));
        assertEquals(null, service.getAsterGDEMElevationFor(58.0, -64.0));
        assertEquals(null, service.getAsterGDEMElevationFor(68.0, -65.0));
        assertEquals(null, service.getAsterGDEMElevationFor(78.0, -65.1));
        assertEquals(null, service.getAsterGDEMElevationFor(88.0, -66.0));
    }

    @Test
    public void testSrtm3ElevationFor() throws IOException {
        assertEquals(209, service.getSRTM3ElevationFor(10.2, 50.001).intValue());
        assertEquals(2071, service.getSRTM3ElevationFor(11.06561, 47.42428).intValue());
        assertEquals(null, service.getSRTM3ElevationFor(0.0, 0.0));

        assertEquals(40, service.getSRTM3ElevationFor(11.2, 59.0).intValue());
        assertEquals(190, service.getSRTM3ElevationFor(11.2, 60.0).intValue());
        assertEquals(null, service.getSRTM3ElevationFor(11.2, 61.0));

        assertEquals(77, service.getSRTM3ElevationFor(-68.0, -54.0).intValue());
        assertEquals(455, service.getSRTM3ElevationFor(-68.0, -55.0).intValue());
        assertEquals(null, service.getSRTM3ElevationFor(-68.0, -56.0));
        assertEquals(null, service.getSRTM3ElevationFor(-68.0, -56.1));
        assertEquals(null, service.getSRTM3ElevationFor(-68.0, -57.0));
    }

    @Test
    public void testGtopo30ElevationFor() throws IOException {
        assertEquals(205, service.getGTOPO30ElevationFor(10.2, 50.001).intValue());
        assertEquals(1789, service.getGTOPO30ElevationFor(11.06561, 47.42428).intValue());
        assertEquals(null, service.getGTOPO30ElevationFor(0.0, 0.0));

        assertEquals(17, service.getGTOPO30ElevationFor(11.2, 59.0).intValue());
        assertEquals(120, service.getGTOPO30ElevationFor(11.2, 60.0).intValue());
        assertEquals(648, service.getGTOPO30ElevationFor(11.2, 61.0).intValue());

        assertEquals(119, service.getGTOPO30ElevationFor(-68.0, -54.0).intValue());
        assertEquals(184, service.getGTOPO30ElevationFor(-68.0, -55.0).intValue());
        assertEquals(null, service.getGTOPO30ElevationFor(-68.0, -56.0));
        assertEquals(null, service.getGTOPO30ElevationFor(-68.0, -56.1));
        assertEquals(null, service.getGTOPO30ElevationFor(-68.0, -57.0));
    }

    @Test
    public void testElevationFor() throws IOException {
        assertEquals(23, service.getElevationFor(11.2, 59.0).intValue());
        assertEquals(162, service.getElevationFor(11.2, 60.0).intValue());
        assertEquals(656, service.getElevationFor(11.2, 61.0).intValue());

        assertEquals(69, service.getElevationFor(-68.0, -54.0).intValue());
        assertEquals(454, service.getElevationFor(-68.0, -55.0).intValue());
        assertEquals(0, service.getElevationFor(-68.0, -56.0).intValue());
        assertEquals(null, service.getElevationFor(-68.0, -56.1));
        assertEquals(null, service.getElevationFor(-68.0, -57.0));
    }

    @Test
    public void testNearByFor() throws IOException {
        assertEquals("St. Margarethen", service.getNearByFor(9.0, 47.5));
        assertEquals("Grafenrheinfeld", service.getNearByFor(10.2, 50.001));
        assertEquals("Hammersbach", service.getNearByFor(11.06561, 47.42428));
        assertEquals("Earth", service.getNearByFor(0.0, 0.0));
        assertNotNull(service.getNearByFor(0.0, -90.0));
        assertEquals("North Pole", service.getNearByFor(0.0, 90.0));
        assertEquals(null, service.getNearByFor(90.0, 90.0));
        assertEquals(null, service.getNearByFor(-90.0, -90.0));
    }

    @Test
    public void testNearByPlaceNameFor() throws IOException {
        assertEquals("St. Margarethen", service.getNearByPlaceNameFor(9.0, 47.5));
        assertEquals("Grafenrheinfeld", service.getNearByPlaceNameFor(10.2, 50.001));
        assertEquals("Hammersbach", service.getNearByPlaceNameFor(11.06561, 47.42428));
        assertEquals(null, service.getNearByPlaceNameFor(0.0, 0.0));
        assertEquals(null, service.getNearByPlaceNameFor(0.0, -90.0));
        assertEquals(null, service.getNearByPlaceNameFor(0.0, 90.0));
        assertEquals(null, service.getNearByPlaceNameFor(90.0, 90.0));
        assertEquals(null, service.getNearByPlaceNameFor(-90.0, -90.0));
    }
}
