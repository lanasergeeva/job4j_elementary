package ru.job4j.exercise.arrayex;
/*
7. Максимум из первого и последнего элемента массива
 */

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        return (array[0] > array[array.length - 1]) ? array[0] : array[array.length - 1];
    }
}
