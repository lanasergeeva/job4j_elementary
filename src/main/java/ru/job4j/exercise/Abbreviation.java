package ru.job4j.exercise;
/*Аббревиатуры
 */

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if(i == 0) {
                sb1.append(sb.charAt(i));
            }
               else if (sb.charAt(i) == ' ') {
                sb1.append(sb.charAt(i+1));
            }
        }
        return sb1.toString();
    }
}
