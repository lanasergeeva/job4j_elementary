package job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {7, 8, 9, 10, 11};
        int[] result = Turn.back(input);
        int[] expect = new int[] {11, 10, 9, 8, 7};
        assertThat(result, is(expect));
    }
}