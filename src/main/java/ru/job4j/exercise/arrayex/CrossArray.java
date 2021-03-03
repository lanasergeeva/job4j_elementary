package ru.job4j.exercise.arrayex;
/*2. Одинаковые элементы для массивов
Заданы два числовых массива.

Нужно вывести на консоль числа, которые есть
одновременно в первом и втором массиве.

 */

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length ; i++) {
            for (int j = 0; j < right.length; j++) {
                int temp = left[i];
                if(temp == right[j]) {
                    System.out.println(temp);
                }
            }
        }
    }
}
