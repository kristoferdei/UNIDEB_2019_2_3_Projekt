package Controllers.GamesController;

import Controllers.Controller;
import Database.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;
import java.util.List;

public class Apex_Adatlap extends Controller<User> {
    @FXML
    Button backButton, trailerButton;

    @FXML
    Label saveSuc;

    /**
     * Vissza gombra való klikkelés,
     * megnyílik a Főképernyő felület
     * @throws Exception
     */
    public void backButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Főképrenyő");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 960, 720));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Trailer gombra való klikkelés,
     * megnyílik a böngészőben az adott játék trailer videója
     * @throws Exception
     */
    public void trailerButtonClicked() throws Exception {
        Desktop browser = Desktop.getDesktop();
        browser.browse(new URI("https://youtu.be/NEAWC9eK1Ts"));

    }

    /**
     *
     * @throws Exception
     */
    public void saveButtonClicked()throws Exception {
        saveSuc.setVisible(true);
    }

    @Override
    public List<User> getData() {
        return null;
    }
}
