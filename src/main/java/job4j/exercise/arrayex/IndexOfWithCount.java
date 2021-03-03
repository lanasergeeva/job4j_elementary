package job4j.exercise.arrayex;
/*
21. indexOf с числом вхождений
 */
public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        for (int i = number + 1; i < string.length; i++) {//тут писала на сайте number + 2
            if(string[i] == c) {
                return i;
            }
        }
        return -1;
    }
}

