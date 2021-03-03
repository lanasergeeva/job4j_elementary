package ru.job4j.exercise;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int fz = 80;
        int zp = 0;
        for (int i = 0; i < hours.length; i++) {
            int hour = hours[i];
            if (i <= 4 && hour <= 8 && hour != 0) {
                zp = zp + hour * 10;
            } else if (i <= 4 && hour > 8) {
               zp = zp + (hour - 8) * 15 + fz;
            } else if (i > 4 && hour <= 8 && hour != 0) {
                zp = zp + 2 * (hour * 10);
            } else if (i > 4 && hour > 8) {
                zp = zp + 2 * ((hour - 8) * 15) + 2 * fz;
            }
            else {
                zp = zp + 0;
            }
        }
        return zp;
    }
}