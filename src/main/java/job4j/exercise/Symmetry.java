package job4j.exercise;
/*
Симметричное число
Для решения можете преобразовать число в строку.
 Проходите по полученной строке в цикле, до середины и
 сравниваете символ который стоит на первой позиции  с
 символом на последней, второй позиции с символом на
 предпоследней и т.д. Для извлечения символов используйте метод charAt().

Метод должен вернуть true, если число симметричное.
 */
public class Symmetry {
    public static boolean check(int i) {
        String temp = Integer.toString(i);;
        for (int j = 0; j <= temp.length()-1; j++) {
                if(temp.charAt(j) == temp.charAt(temp.length()-j-1)) {
                }
                else {
                    return false;
                }
            }
        return true;
    }
}
