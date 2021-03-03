package job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(2, 0, 7, 5);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayIs55() {
        int way = ChessBoard.way(2, 6, 4, 4);
        assertThat(way, is(2));
    }
}