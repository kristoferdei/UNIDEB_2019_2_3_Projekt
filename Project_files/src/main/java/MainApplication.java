import Database.Game;
import Database.GameDAO;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import util.guice.PersistenceModule;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("FXML/Udvozlo.fxml"));
        primaryStage.setTitle("Game_Over");
        primaryStage.getIcons().add(new Image("/Pictures/Icon.png"));
        primaryStage.setScene(new Scene(root, 480, 720));
        primaryStage.setResizable(false);
        primaryStage.show();

      /*  Injector injector = Guice.createInjector(new PersistenceModule("game"));
        GameDAO gameDao = injector.getInstance(GameDAO.class);
        Game game = Game.builder()
                .releaseDate(new Date())
                .creators("MÁV")
                .genres(Arrays.asList("Horror","Thriller","Hentai"))
                .gameName("Terror on the Train")
                .description("safshaniognioasngivopnasivnafnpapdfanpsfdnapfsnapfa")
                .build();
        Game game2 = Game.builder()
                .releaseDate(new SimpleDateFormat("dd/MM/yyyy").parse("09/08/1998"))
                .creators("MÁV")
                .genres(Arrays.asList("Horror","Thriller","Action"))
                .gameName("Terror on the Train")
                .description("safshaniognioasngivopnasivnafnpapdfanpsfdnapfsnapfa")
                .build();
        gameDao.persist(game);
        gameDao.persist(game2);*/

    }

}