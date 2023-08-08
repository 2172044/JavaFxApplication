package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {


    @FXML

    private void showForm() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("form-view.fxml"));

        Parent root = fxmlLoader.load();
        Scene registerscene = new Scene(root);
        Stage registerStage = new Stage();

        registerStage.setScene(registerscene);
        registerStage.setTitle("Form");

        registerStage.show();
    }
}
