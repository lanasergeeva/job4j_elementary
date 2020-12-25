package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax8To6Then8() {
        int result = Max.max(8, 6);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax4To10Then10() {
        int result = Max.max(4, 10);
        assertThat(result, is(10));
    }
}