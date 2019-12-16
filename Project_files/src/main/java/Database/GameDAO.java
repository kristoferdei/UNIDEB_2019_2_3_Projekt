package Database;

import util.jpa.GenericJpaDao;

import javax.persistence.TemporalType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GameDAO extends GenericJpaDao<Game>{

    public GameDAO() {
        super(Game.class);
    }

    public List<Game> findAfter(int n){

        Date date = new Date();

        try {
            date = new SimpleDateFormat("yyyy").parse(String.valueOf(n));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return entityManager.createQuery("SELECT g FROM Game g WHERE releaseDate > :date").setParameter("date",date, TemporalType.DATE).getResultList();
    }

    public List<Game> findGenre(String genre){
        return entityManager.createQuery("SELECT g from Game g WHERE (:genre) member of genres").setParameter("genre",genre).getResultList();
    }
}
