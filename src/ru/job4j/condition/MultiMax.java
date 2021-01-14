package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(10, 10, 1));

    }
}

