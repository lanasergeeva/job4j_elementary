package ru.job4j.exercise.young;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String temp = "none";
        if (left + right == rsl) {
            temp = "added";
        } else if (left - right == rsl) {
            temp = "subtracted";
        } else if (left / right == rsl) {
            temp = "divided";
        } else if (left * right == rsl) {
            temp = "multiplied";
        }
        return temp;
    }
}
