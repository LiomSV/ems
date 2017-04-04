package org.vst.ems.client.control;

import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.MapType;
import com.sothawo.mapjfx.MapView;
import com.sothawo.mapjfx.WMSParam;
import com.sothawo.mapjfx.event.MapViewEvent;
import javafx.fxml.FXML;

public class MapController {

    @FXML
    private MapView mainMap;

    /** params for the first WMS server. */
    private WMSParam wmsParamGisLandsat = new WMSParam()
            .setUrl("http://irs.gis-lab.info/?")
            .addParam("layers", "landsat")
            .addParam("REQUEST", "GetTile");

    /** params for the second WMS server. */
    private WMSParam wmsParamWFPAdminBoundaries = new WMSParam()
            .setUrl("http://geonode.wfp.org:80/geoserver/ows")
            .addParam("layers", "geonode:admin_2_gaul_2015");

    public void initialize() {
        mainMap.initializedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                afterMapIsInitialized();
            }
        });

        mainMap.addEventHandler(MapViewEvent.MAP_EXTENT, event -> {
            event.consume();
            mainMap.setExtent(event.getExtent());
        });

        mainMap.setMapType(MapType.OSM);

        mainMap.initialize();
        mainMap.setCenter(new Coordinate(53.8839692,27.5249347));
    }

    private void afterMapIsInitialized() {
        mainMap.setZoom(14);
        mainMap.setCenter(new Coordinate(53.8839692,27.5249347));
        mainMap.setMapType(MapType.OSM);

    }

}
