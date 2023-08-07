package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField Username;

    @FXML
    private PasswordField Password;

    @FXML
    private void onLoginButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("login-view.fxml"));
        try {
            // Retrieve user input from the registration form (username, password)
            // access the input fields from the form using appropriate JavaFX controls.

            // For simplicity, let's assume the registration is successful if the required fields are not empty.
            //  to perform additional validations and interact with a database or storage to complete a real registration process.

            // Example: Assuming  TextField objects named "usernameField", "passwordField", and "emailField":


            String username = Username.getText();
            String password = String.valueOf(Password.getCursor());


            if (!username.isEmpty() && !password.isEmpty()) {

                FXMLLoader fxmlLoader1 = new FXMLLoader(LoginController.class.getResource("dashboard-view.fxml"));
                Scene registerscene = new Scene(fxmlLoader1.load());
                Stage registerStage = new Stage();
                registerStage.setScene(registerscene);
                registerStage.setTitle("Dashboard");
                registerStage.show();

            } else {
                // Some fields are empty, so the registration is not successful.
                 //  display an error message or perform additional validations here.

                // Display an error message to the user.
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Error");
                errorAlert.setHeaderText(null);
                errorAlert.setContentText("Please fill in all the required fields.");
                errorAlert.showAndWait();

            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle any exceptions that may occur during the registration process.
        }
    }
        @FXML

        private void showRegisterStage () throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("register-view.fxml"));
            Scene registerscene = new Scene(fxmlLoader.load());
            Stage registerStage = new Stage();

            registerStage.setScene(registerscene);
            registerStage.initModality(Modality.APPLICATION_MODAL);
            registerStage.setTitle("User Registration");


            registerStage.show();
        }
    }

