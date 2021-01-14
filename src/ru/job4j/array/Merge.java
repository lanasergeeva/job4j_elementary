package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int index = 0; index < left.length; index++)  {
            rsl[index] = left[index];
        }
        for (int index = 0; index < right.length; index++) {
            rsl[index+left.length] = right[index];
        }
        return rsl;
    }
}
