package ru.job4j.exercise.arrayex;
/*4. Размер массива
Вам даны 2 массива чисел. Вам необходимо определить общий
 размер массива при их объединении. В этом задании
 объединять ничего не нужно,
Вам необходимо только определить общий
размер результирующего массива.
 */

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        int [] c = new int[a.length + b.length];
        return c.length;
    }
}
