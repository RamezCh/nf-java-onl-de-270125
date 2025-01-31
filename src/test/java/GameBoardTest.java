import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTest {

    /*
    @BeforeEach // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        PlayerCharacter.x =0;
        PlayerCharacter.y =0;
    }
     */
    @Test
    public void testMoveHorizontal_LeftWithinBounds() {
        int width = 5;
        int characterX = 2;
        int expected = characterX - 1;
        int newX = GameBoard.moveHorizontal('A', width, characterX);
        assertEquals(expected, newX);
    }

    @Test
    public void testMoveHorizontal_LeftOutOfBounds() {
        int width = 5;
        int characterX = 0;
        int newX = GameBoard.moveHorizontal('A', width, characterX);
        assertEquals(characterX, newX);
    }

    @Test
    public void testMoveHorizontal_RightWithinBounds() {
        int width = 5;
        int characterX = 2;
        int expected = characterX + 1;
        int newX = GameBoard.moveHorizontal('D', width, characterX);
        assertEquals(expected, newX);
    }

    @Test
    public void testMoveHorizontal_RightOutOfBounds() {
        int width = 5;
        int characterX = 4;
        int newX = GameBoard.moveHorizontal('D', width, characterX);
        assertEquals(characterX, newX);
    }

    @Test
    public void testMoveVertical_UpWithinBounds() {
        int height = 5;
        int characterY = 2;
        int expected = characterY - 1;
        int newY = GameBoard.moveVertical('W', height, characterY);
        assertEquals(expected, newY);
    }

    @Test
    public void testMoveVertical_UpOutOfBounds() {
        int height = 5;
        int characterY = 0;
        int newY = GameBoard.moveVertical('W', height, characterY);
        assertEquals(characterY, newY);
    }

    @Test
    public void testMoveVertical_DownWithinBounds() {
        int height = 5;
        int characterY = 2;
        int expected = characterY + 1;
        int newY = GameBoard.moveVertical('S', height, characterY);
        assertEquals(expected, newY);
    }

    @Test
    public void testMoveVertical_DownOutOfBounds() {
        int height = 5;
        int characterY = 4;
        int newY = GameBoard.moveVertical('S', height, characterY);
        assertEquals(characterY, newY);
    }

    @Test
    public void testMoveHorizontal_InvalidDirection() {
        int width = 5;
        int characterX = 2;
        int newX = GameBoard.moveHorizontal('X', width, characterX);
        assertEquals(characterX, newX);
    }

    @Test
    public void testMoveVertical_InvalidDirection() {
        int height = 5;
        int characterY = 2;
        int newY = GameBoard.moveVertical('X', height, characterY);
        assertEquals(characterY, newY);
    }
}