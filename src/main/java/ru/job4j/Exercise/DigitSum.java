package ru.job4j.Exercise;
/*Сумма цифр
Дано число, нужно получить сумму его цифр
 */

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        for (int i = num; i > 0 ; i=i/10) {
            sum =sum + i % 10;
        }
        return sum;
    }
}
