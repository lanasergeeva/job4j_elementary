package ru.job4j.exercise.arrayex;
/*
19. Вывести нечетные в порядке возрастания индексов
 */
public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
