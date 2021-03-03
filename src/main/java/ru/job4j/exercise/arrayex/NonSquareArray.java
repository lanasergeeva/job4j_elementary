package ru.job4j.exercise.arrayex;
/*11. Создание неоднородного двумерного массива.
В задании необходимо расскомментировать код, заполнить массив
значениями от 1 до 6, при этом:
1. Разбить значения на 3 массива.
2. В первом должен быть 1 элемент, втором - 2 элемента, третьем - 3 элемента.
 */

public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
                System.out.println(array[i][j]);
            }
        }
    }
}
