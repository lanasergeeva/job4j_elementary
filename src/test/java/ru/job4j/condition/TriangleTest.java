package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

    public class TriangleTest {

    @Test
    public void whenExist222() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExist5114() {
        boolean result = Triangle.exist(6, 11, 4);
        assertThat(result, is(false));
        }
}