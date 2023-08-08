package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FormController {
    @FXML
    TextField text1;

    //Button button1;

    @FXML
    private void ShowStruk (ActionEvent ex) throws IOException {
        Stage registerStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("struk-view.fxml"));


        Parent root = fxmlLoader.load();
        Scene registerscene = new Scene(root);
        registerStage.setScene(registerscene);
        //new_Stage.initModality(Modality.APPLICATION_MODAL);
        registerStage.setTitle("Struk");

        StrukController Sc = fxmlLoader.getController();
        Sc.isiLabel2(text1.getText());
        registerStage.show();
         System.out.println(Sc.getIsiLabel());
    }
}
