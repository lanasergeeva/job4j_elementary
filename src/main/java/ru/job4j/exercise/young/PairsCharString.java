package ru.job4j.exercise.young;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return (l.isEmpty() && r.isEmpty()) ||
                (r.endsWith(String.valueOf(l.charAt(0))) &&
                        l.endsWith(String.valueOf(r.charAt(0))));
    }
}
