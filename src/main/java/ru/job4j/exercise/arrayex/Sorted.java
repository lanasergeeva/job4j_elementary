package ru.job4j.exercise.arrayex;
/*Проверить сортировку массива
Задана числовой массив. Необходимо написать программу,
 которая проверит, что массив отсортирован по возрастанию.
 */

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
               result = false;
               break;
            }
        }
        return result;
    }
}
