package ru.job4j.exercise;
/* Вывести стоимость конфет за килограмм
 Дано целое число price — цена 1 кг конфет.
 Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */
public class SweetPrice {
    public static void out(int price) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = price * i;
            System.out.println(sum);
        }
    }
}
