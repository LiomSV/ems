package org.vst.ems.client.control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.vst.ems.client.model.MCall;

import java.net.URL;
import java.util.ResourceBundle;

public class CallTableController implements Initializable {

    @FXML
    private TableView<MCall> callTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        callTable.getItems().addAll(
            new MCall(1, "10-12-2016", "AAAAA"),
            new MCall(2, "12-12-2016", "BBBB"),
            new MCall(3, "17-12-2016", "CCCCC"),
            new MCall(5, "26-01-2017", "TTTTTT")
        );
    }
}
