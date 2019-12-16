package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Fokepernyo implements Initializable {

    @FXML
    Button signOutButton, mainButton, libButton, exitButton;

    @FXML
    ImageView rainbowPic, dsPic, nfsPic, pubgPic, rd2Pic,rlPic,codPic, gtaPic, apexPic, csgoPic, fifaPic, bfPic, ds3Pic, mkPic, swPic;

    @FXML
    Pane mainPane, libPane;

    /**
     * Kijelentkezés gombra való klikkelés,
     * megnyílik az Üdvözlő felület
     * @throws Exception
     */
    public void signOutButtonClicked() throws Exception {
        Udvozlo.loggedIn = false;
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage mainStage = new Stage();
        mainStage.setTitle("Bejelentkezés");
        mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        mainStage.setScene(new Scene(newUser, 480, 720));
        mainStage.setResizable(false);
        mainStage.show();
        Stage stage = (Stage) signOutButton.getScene().getWindow();
        stage.close();
    }



    /**
     * Játék borítójára való kattintással,
     * megnyílik a játék adatlapja
     * @throws Exception
     */
    public void rainbowGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/R6_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) rainbowPic.getScene().getWindow();
        stage.close();
    }
    public void dsGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/DS_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) dsPic.getScene().getWindow();
        stage.close();
    }
    public void nfsGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/NFS_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) nfsPic.getScene().getWindow();
        stage.close();
    }
    public void pubgGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/PUBG_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) pubgPic.getScene().getWindow();
        stage.close();
    }
    public void reddead2Game() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/RD2_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) rd2Pic.getScene().getWindow();
        stage.close();
    }
    public void rocketleagueGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/RL_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) rlPic.getScene().getWindow();
        stage.close();
    }
    public void codGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/COD_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) codPic.getScene().getWindow();
        stage.close();
    }
    public void gtaGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/GTA_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) gtaPic.getScene().getWindow();
        stage.close();
    }
    public void apexGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/Apex_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) apexPic.getScene().getWindow();
        stage.close();
    }
    public void csgoGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/CSGO_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) csgoPic.getScene().getWindow();
        stage.close();
    }
    public void fifaGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/Fifa_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) fifaPic.getScene().getWindow();
        stage.close();
    }
    public void bfGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/BF_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) bfPic.getScene().getWindow();
        stage.close();
    }
    public void ds3Game() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/DS3_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) ds3Pic.getScene().getWindow();
        stage.close();
    }
    public void mkGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/MK_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) mkPic.getScene().getWindow();
        stage.close();
    }
    public void swGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/SW_Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) swPic.getScene().getWindow();
        stage.close();
    }

    /**
     * Főoldal gombra való klikkelés,
     * megnyílik a Föoldal felület
     * @throws Exception
     */
    public void mainButtonClicked() throws Exception {
        mainPane.setVisible(true);
        libPane.setVisible(false);

    }

    /**
     * Könyvtár gombra való klikkelés,
     * megnyílik a könyvtár felület
     * @throws Exception
     */
    public void libButtonClicked() throws Exception {
        mainPane.setVisible(false);
        libPane.setVisible(true);

    }

    /**
     * Kilépés gombra való klikkelés,
     * a programból való kilépés
     * @throws Exception
     */
    public void exitButtonClicked() throws Exception {
        System.exit(0);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(!Udvozlo.loggedIn){
            libButton.setDisable(true);
        }
    }
}
