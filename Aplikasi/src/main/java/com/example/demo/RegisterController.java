package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    private TextField firstnameField;

    @FXML
    private TextField lastnameField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void Register(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("register-view.fxml"));
        try {


            String firstname = firstnameField.getText();
            String lastname = lastnameField.getText();
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getCursor());



            if (!username.isEmpty() && !password.isEmpty() && !lastname .isEmpty()) {
                // The registration is successful.

                // Display a success message to the user.
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Registration Successful");
                successAlert.setHeaderText(null);
                successAlert.setContentText("Congratulations, your registration is successful!");
                successAlert.showAndWait();

                // Optionally, you can clear the form fields after a successful registration.
                // usernameField.clear();
                // passwordField.clear();
                // emailField.clear();

                // Perform any other actions you need for successful registration.
            } else {
                // Some fields are empty, so the registration is not successful.
                // You might want to display an error message or perform additional validations here.

                // Display an error message to the user.
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Error");
                errorAlert.setHeaderText(null);
                errorAlert.setContentText("Please fill in all the required fields.");
                errorAlert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    @FXML
    private void BackToLogin() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(RegisterController.class.getResource("login-view.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load());
        Stage loginStage =new Stage();

        loginStage .setScene(loginScene);
        loginStage .setTitle("User Registration");

        loginStage .show();
    }

    }

