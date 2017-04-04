package org.vst.ems.client.control;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.vst.ems.client.model.MCrew;

import java.net.URL;
import java.util.ResourceBundle;

public class CrewTableController implements Initializable {

    @FXML
    private TableView<MCrew> crewTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        crewTable.getItems().addAll(
                new MCrew(100, 2L, true),
                new MCrew(250, null, false),
                new MCrew(550, null, false)
        );
    }
}
