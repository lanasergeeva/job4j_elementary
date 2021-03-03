package ru.job4j.exercise.arrayex;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int start = 0;
        int end = 0;
        int temp =  1;
        if(array.length < 2) {
            return array.length;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1])
                temp++;
         else {
            if (start < temp) start = temp;
            temp = 1;
        }
    }
    temp = 1;
        for (int i = 1; i < array.length; i++)
    {
        if (array[i] < array[i - 1]) temp++;
        else
        {
            if (end < temp) end = temp;
            temp = 1;
        }
    }
        return Math.max(start, end);
        }
}

/*
 if(job4j.array.length <= 3) {
         temp = 1;
         for (int i = 0; i < job4j.array.length - 1; i++) {
        if (job4j.array[i] <= job4j.array[i + 1])
        temp = temp + i + 1;
        }
        else {
        for (int i = 0; i < job4j.array.length - 1; i++) {
            if (job4j.array[i] <= job4j.array[i + 1])
                temp++;
        }*/

/*int bestStart = 0;
        int bestEnd = 0;

        int start = 0;
        int end = 0;

        for (int i = 1; i < job4j.array.length; i++)
        {
            if (job4j.array[i] <= job4j.array[i - 1]) {
                if (end - start > bestEnd - bestStart) {
                    bestEnd = end;
                    bestStart = start;
                }
                start = i;
                end = i;
            }
            else
            {
                end = i;
            }
        }
        int[] result = new int[bestEnd - bestStart + 1];
        for (int i = bestStart; i <= bestEnd; ++i) {
            result[i - bestStart] = job4j.array[i];
        }
        return result.length;
    }*/