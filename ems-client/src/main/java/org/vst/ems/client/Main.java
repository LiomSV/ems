package org.vst.ems.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle i18nBundle = ResourceBundle.getBundle("org.vst.ems.client.translations", new Locale("en"));
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"), i18nBundle);
        Scene scene = new Scene(root ,1200, 600);
        primaryStage.setTitle("Sample Application");
        primaryStage.setScene(scene);
        primaryStage.show();
//        SimpleStringProperty
    }

    public static void main(String[] args) {
        launch(args);
    }

}
