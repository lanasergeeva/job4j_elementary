package ru.job4j.Exercise.Array;
/*
16. Заполнить треугольную матрицу
 */

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int k = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j < triangle[i].length ; j++) {
                triangle[i][j] = k;
                k++;
            }
            }
        return triangle;
    }
}

