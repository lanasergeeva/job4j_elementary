package job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skip2() {
        int[][] in = {
                {2, -9, -4, 2 },
                {2, -1, -5, 7}
        };
        int[][] expect = {
                {2, 0, 0, 2},
                {2, 0, 0, 7}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}