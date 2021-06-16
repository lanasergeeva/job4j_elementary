package ru.job4j.exercise.young;

public class HelloWorld {
    public static String checkNumber(int number) {
        String temp = "Operation not support";
        if (number % 3 == 0) {
            temp = "Hello";
        }
        if (number % 5 == 0) {
            temp = "World";
        }
        if (number % 5 == 0 && number % 3 == 0) {
            temp = "Hello, World!!!";
        }
        return temp;
    }
}
