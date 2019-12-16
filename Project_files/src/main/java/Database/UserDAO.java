package Database;

import util.jpa.GenericJpaDao;

import java.util.List;

public class UserDAO extends GenericJpaDao {

    public UserDAO() {
        super(User.class);
    }

    public List<User> getAllUser(){
        return entityManager.createQuery("Select u from User u").getResultList();
    }
}
