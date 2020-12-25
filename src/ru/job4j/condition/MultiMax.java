package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    public static int maxAnother(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                return first;
            } else {
                return third;
            }
            }  else if (second > third) {
            return second;
            } else {
            return third;
        }
    }


    public static void main(String[] args) {
        System.out.println(MultiMax.max(8, 7, 34));
        System.out.println(MultiMax.maxAnother(1, 6, 7));
    }
}

