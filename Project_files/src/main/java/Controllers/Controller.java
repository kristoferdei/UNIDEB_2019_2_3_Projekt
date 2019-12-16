package Controllers;

import Database.GameDAO;
import Database.UserDAO;
import com.google.inject.Guice;
import com.google.inject.Injector;
import util.guice.PersistenceModule;
import util.jpa.GenericJpaDao;

import java.util.List;

public abstract class Controller<T> {

    private Injector gameInjector = Guice.createInjector(new PersistenceModule("game"));;

    GameDAO gameDao = gameInjector.getInstance(GameDAO.class);

    private Injector userInjector = Guice.createInjector(new PersistenceModule("user"));;

    UserDAO userDao = userInjector.getInstance(UserDAO.class);

    public abstract List<T> getData();

}
