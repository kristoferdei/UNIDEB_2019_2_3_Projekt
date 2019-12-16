package Database;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void gameNameTest() throws Exception {
        Game testGame = new Game("Ubisoft", "R6S", "online tactical shooter video game");
        assertEquals("R6S", testGame.getGameName());
        assertNotEquals("PUBG", testGame.getGameName());
    }

    @Test
    public void gameCratorTest() throws Exception {
        Game testGame = new Game("Ubisoft", "R6S", "online tactical shooter video game");
        assertEquals("Ubisoft", testGame.getCreators());
        assertNotEquals("EA", testGame.getCreators());
    }

    @Test
    public void gameDescriptionTest() throws Exception {
        Game testGame = new Game("Ubisoft", "R6S", "online tactical shooter video game");
        assertEquals("online tactical shooter video game", testGame.getDescription());
        assertNotEquals("online multiplayer battle royale game", testGame.getDescription());
    }

}