package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int f = 1;
        for (int index = 1; index <= n; index++) {
            f =  f * index;
        }
            return f;
    }
}
