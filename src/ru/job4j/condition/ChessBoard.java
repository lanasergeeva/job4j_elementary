package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 != x2 && y1 != y2) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
            return rsl;
        }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(2, 0, 7, 5));
        System.out.println(ChessBoard.way(0, 2, 4, 6));
    }
}


