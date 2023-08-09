package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.scene.Scene;

import java.io.IOException;


public class FormController {
    @FXML
   TextField text1;
    @FXML
    TextField text2;

    @FXML
    TextField text3;
    @FXML
    TextField text4;
    @FXML
    TextField text5;
    @FXML
    TextField text6;
    @FXML
    TextField text7;
    @FXML
    Button button1;
    //Stage new_stage;
   // Stage new_stage2;

//public void initialize(){ new_stage = new Stage();
  //  new_stage2 = new Stage();

//}
    public void onHelloButtonClick(ActionEvent ex) throws IOException {
        Stage new_stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("struk.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);

        new_stage.setScene(new_scene);
        new_stage.setTitle("Page 2");

        StrukController sc = loader.getController();
        sc.isilabel1(text1.getText());

        StrukController sc1 = loader.getController();
        sc1.isilabel2(text2.getText());

        StrukController sc2 = loader.getController();
        sc2.isilabel3(text3.getText());

        StrukController sc3 = loader.getController();
        sc3.isilabel4(text4.getText());

        StrukController sc4 = loader.getController();
        sc4.isilabel5(text5.getText());


        StrukController sc5 = loader.getController();
        sc5.isilabel6(text6.getText());

        StrukController sc6 = loader.getController();
        sc6.isilabel7(text7.getText());


        //public void  showDate(ActionEvent ex1 ) throws IOException{
            //LocalDate Id = date.getValue();

        //}
        new_stage.show();



    }
}