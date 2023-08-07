package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FormController {
    @FXML

    private void ShowStruk () throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("struk-view.fxml"));
        Scene registerscene = new Scene(fxmlLoader.load());
        Stage registerStage = new Stage();

        registerStage.setScene(registerscene);
        registerStage.setTitle("Struk");

        registerStage.show();
    }
}
