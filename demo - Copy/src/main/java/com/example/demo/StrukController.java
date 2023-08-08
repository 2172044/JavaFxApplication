package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StrukController {
    @FXML
    Label label2;

    public String getIsiLabel(){
        return label2.getText();
    }
 public void isiLabel2 (String isi){
     label2.setText(isi);

 }
}
