package ru.job4j.exercise.arrayex;
/*10. Создание квадратного двумерного массива
В задании необходимо расскомментировать код,
создать массив размером 2 на 2, заполнить его значениями от 1 до 4.
 При этом не нужно указывать размерность,
 она будет определена при заполнении массива.
 */
public class SquareArray {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = k;
                k++;
                System.out.println(array[i][j]);
            }
        }
    }
}
