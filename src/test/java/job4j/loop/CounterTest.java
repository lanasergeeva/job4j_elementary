package job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(20, 30);
        int expected = 150;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumFrom0to5() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }
}