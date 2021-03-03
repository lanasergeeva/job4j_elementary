package ru.job4j.exercise;
/*1. Шифр строки
Необходимо реализовать метод, который принимает строку, которую необходимо зашифровать таким образом, чтобы на выходе отражались только 4 последних элемента, все остальные были заменены на #. При этом соблюсти условия:

1. Если входная строка пустая - необходимо вернуть строку "empty";

2. Если входная строка содержит больше 0 и не более 4 символов - метод должен вернуть исходную строку.

Для решения используйте StringBuilder и его метод setCharAt().
 */

public class Cryptography {
    public static String code(String s) {
        String empty = "empty";
        StringBuilder sb1 = new StringBuilder(s);
        if (s.isEmpty()) {
            return empty;
        } else if (sb1.length() != 0 && sb1.length() < 4) {
            return s;
        }
        for (int i = 0; i < sb1.length() - 4; i++) {
        sb1.setCharAt(i, '#');
        }
        return sb1.toString();
    }
}
