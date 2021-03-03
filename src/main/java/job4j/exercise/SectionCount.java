package job4j.exercise;
/* Найти количество отрезков, используя цикл
Даны два целых положительных числа length, section. length это расстояние.
Вам нужно не используя операцию деления
 найти сколько раз отрезок длиной section помещает в length.
 Нужно использовать цикл while
 */

public class SectionCount {
    public static int count(int length, int section) {
        int temp =0;
    while (length >= section) {
        length = length - section;
        temp++;
    }
    return temp;
    }
}
