package Controllers;

import Database.User;
import Database.UserDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.List;

public class Regisztracio extends Controller<User> {

    @FXML
    Button registButton, backButton;

    @FXML
    TextField registName;

    @FXML
    PasswordField registPasw;

    @FXML
    Label warningName, warningPassw;

    /**
     * Regisztrációs mezők helyes kitöltésének ellenőrzése,
     * üresen hagyott mezők esetén figyelmeztetés
     * @throws Exception
     */

    public void registCheck()
    throws Exception{
        warningName.setVisible(false);
        warningPassw.setVisible(false);
        if(registName.getText().equals("") && registPasw.getText().equals("")){
                warningName.setVisible(true);
                warningPassw.setVisible(true);

        } else if(registName.getText().equals("")) {
           warningName.setVisible(true);
        } else if(registPasw.getText().equals("")) {
            warningPassw.setVisible(true);
        } else {
            if (getData().stream().anyMatch(e -> e.getUsername().equals(registName.getText()))) {
                //TODO: Visszajelzés, hogy létezik már a felhasználó
            } else {
                User newUser = User.builder()
                        .username(registName.getText())
                        .password(hasher(registPasw.getText())).build();

                userDao.persist(newUser);
                backToLogin();
            }
        }
    }
    /**
     * Regsztráció gombra való kattintás,
     * megnyílik az Üdvözlő felület
     * @throws Exception
     */
    public void backToLogin() throws Exception{
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) registButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Vissza gombra való kattintás,
     * visszalépés az Üdvözlő felületre
     * @throws Exception
     */
    public void backButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

    }

    @Override
    public List<User> getData() {
        return userDao.getAllUser();
    }


    public static String hasher(String string) {
        String hash1 = "xtrezrtu6tfia2gsudhijdad";
        String hash2 = "ddbo1e3768798p3ue1hbdncv";
        return hash1 + caesarCoder(string) + hash2;
    }

    private static StringBuffer caesarCoder(String passwd) {
        int s = 5;
        StringBuffer result= new StringBuffer();

        for (int i=0; i<passwd.length(); i++)
        {
            if (Character.isUpperCase(passwd.charAt(i)))
            {
                char ch = (char)(((int)passwd.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)passwd.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}
