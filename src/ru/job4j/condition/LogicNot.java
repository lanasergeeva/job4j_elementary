package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return num % 2 != 0;
    }

    public boolean notPositive(int num) {
        return num < 0;
    }

    public boolean notEvenAndPositive(int num) {
        return (num > 0) && (num % 2 != 0);
    }

    public boolean evenOrNotPositive(int num) {
        return (num % 2 == 0) || (num < 0);
    }

    public static void main(String[] args) {
        LogicNot ln = new LogicNot();
        System.out.println(ln.isEven(11));
        System.out.println(ln.isPositive(-7));
        System.out.println(ln.notEven(3));
        System.out.println(ln.notPositive(-9));
        System.out.println(ln.notEvenAndPositive(17));
        System.out.println(ln.evenOrNotPositive(-10));
    }
}
