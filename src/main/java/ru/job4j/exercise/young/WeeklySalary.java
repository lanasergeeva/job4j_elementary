package ru.job4j.exercise.young;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int temp = 0;
        for (int i = 0; i < hours.length; i++) {
            int rsl = hours[i];
            if (i < 5 && (rsl <= 8)) {
                temp += rsl * 10;
            } else if (i < 5) {
                temp += (rsl - 8) * 15 + (rsl - (rsl - 8)) * 10;
            } else if (rsl < 8) {
                temp += hours[i] * 20;
            } else if (rsl > 8) {
                temp += (rsl - 8) * 30 + (rsl - (rsl - 8)) * 20;
            }
        }
        return temp;
    }
}
