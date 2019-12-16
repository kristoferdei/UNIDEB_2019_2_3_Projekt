package Controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Uj_jelszo {

    @FXML
    Button saveButton, backButton1;

    @FXML
    Label warningName, warningPassw;

    @FXML
    JFXTextField userName, newPassw;

    /**
     * Új jelszó igényléséhez szükséges mezők kitöltésének ellenőrzése,
     * üresen hagyott mezők esetén figyelmeztetés
     * @throws Exception
     */
    public void emptyCheck() throws Exception{
        warningName.setVisible(false);
        warningPassw.setVisible(false);
        if(userName.getText().equals("") && newPassw.getText().equals("")){
            warningName.setVisible(true);
            warningPassw.setVisible(true);
        } else if(userName.getText().equals("")) {
            warningName.setVisible(true);
        } else if(newPassw.getText().equals("")) {
            warningPassw.setVisible(true);
        } else {
            saveButtonClicked();
        }

    }

    /**
     * Mentés gombra való kattintás,
     * megnyílik az Üdvözlő felület
     * @throws Exception
     */
    public void saveButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) saveButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Vissza gombra való kattintás,
     * visszalépés az Üdvözlő felületre
     * @throws Exception
     */
    public void backButton1Clicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) backButton1.getScene().getWindow();
        stage.close();

    }

}
