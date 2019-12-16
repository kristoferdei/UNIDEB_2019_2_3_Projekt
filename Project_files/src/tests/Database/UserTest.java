package Database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UserTest {

    @Test
    public void userIdTest() throws Exception {
        User testUser = new User(1, "Gamer001", "qwerty666");
        assertEquals(1, testUser.getUserid());
        assertNotEquals(5, testUser.getUserid());
    }

    @Test
    public void userNameTest() throws Exception {
        User testUser = new User(1, "Gamer001", "qwerty666");
        assertEquals("Gamer001", testUser.getUsername());
        assertNotEquals("Moviestar7", testUser.getUsername());
    }

    @Test
    public void userPasswordTest() throws Exception {
        User testUser = new User(1, "Gamer001", "qwerty666");
        assertEquals("qwerty666", testUser.getPassword());
        assertNotEquals("wasd0123456", testUser.getPassword());
    }

}
