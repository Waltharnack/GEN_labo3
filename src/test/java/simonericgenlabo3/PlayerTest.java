package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {

    @BeforeAll
    public static void playerCreationTest(){
        Piece piece = new Piece("test", new Square("1"));
        Die dice [] = {new Die(), new Die()};
        Board board = new Board();
        Player player = new Player("player one", piece, dice, board);
        assertNotNull(player);
    }

    @Test
    public void playerShouldMoveAfterATurn(){
        Piece piece = new Piece("test", new Square("Go"));
        Die dice [] = {new Die(), new Die()};
        Board board = new Board();
        Player player = new Player("player one", piece, dice, board);
        player.takeTurn();
        assertNotEquals("Go", piece.getLocation().getName());
    }
}
