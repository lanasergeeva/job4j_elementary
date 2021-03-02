package ru.job4j.Exercise;
/*Найти сумму каждого второго числа в диапазоне
Даны два целых положительных числа a и b (b > a).
Надо сложить каждое второе число в диапазоне
[a, b] начиная с первого

 */

public class SecondSum {
    public static int sum(int a, int b) {
        int temp = 0;
        for (int i = a; i <= b; i+=2) {
            temp+=i;
        }
        return temp;
    }
}
