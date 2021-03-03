package ru.job4j.exercise.arrayex;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CrossArrayTest {
    @Test
    public void whenHasCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 3},
                new int[] {2, 1}
        );
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }

    @Test
    public void whenNotCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(out.toString(), is(""));
    }

    @Test
    public void whenNotCross2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 2, 5, 9},
                new int[] {3, 4, 9, 7}
        );
        assertThat(out.toString(), is("9" + System.lineSeparator()));
    }

}