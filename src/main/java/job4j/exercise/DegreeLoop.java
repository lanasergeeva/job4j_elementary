package job4j.exercise;
/*Найти степень числа
Дано целое число a и целое число degree (> 0).
Найти a в степени degree: a^degree = a·a· . . . ·a
(числа a перемножаются degree раз).
 */
public class DegreeLoop {
    public static int calculate(int a, int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp * a;
        }
        return temp;
    }
}
