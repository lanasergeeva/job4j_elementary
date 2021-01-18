package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int one = 0;
        int two = 0;
        for (int index = 0; index < rsl.length; index++)  {
            if(one > left.length - 1) {
                int temp = right[two];
                rsl[index] = temp;
                two++;
            } else if (two > right.length - 1){
                int temp = left[one];
                rsl[index] = temp;
                one++;
            }
            else if (left[one] < right[two]){
                int temp = left[one];
                rsl[index] = temp;
                one++;
            }
            else {
                int temp = right[two];
                rsl[index] = temp;
                two++;
            }
        }
        return rsl;
    }
}

    /*public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int index = 0; index < left.length; index++)  {
            rsl[index] = left[index];
        }
        for (int index = 0; index < right.length; index++) {
            rsl[index + left.length] = right[index];
        }
        return rsl;
    }*/
