package job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(19, 4, 11);
        assertThat(result, is(19));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(8, 12, 3);
        assertThat(result, is(12));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(2, 4, 5);
        assertThat(result, is(5));
    }
}
