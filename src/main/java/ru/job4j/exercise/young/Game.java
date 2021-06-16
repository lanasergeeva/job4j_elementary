package ru.job4j.exercise.young;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
    /*    int result = 0;
        double temp = percent * (double) prize;
        if (temp > pay && temp > 0) {
            result = (int)(temp - pay);
        }
        else if (temp < 0) {
            result = 0;
        }
        return result;
    }*/
        double temp = percent * (double) prize;
        return (temp > pay && temp > 0) ? (int) (temp - pay) : 0;
    }
}
