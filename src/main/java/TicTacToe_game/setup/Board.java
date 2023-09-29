package TicTacToe_game.setup;


import java.util.ArrayList;
import java.util.List;

public class Board {
    public static List<Integer> playerPositions1O = new ArrayList<>();
    public static List<Integer> playerPositions2X = new ArrayList<>();


    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static char[][] getChars5x5() {

        return new char[][]{{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},};
    }

    public static char[][] getChars3x3() {

        return new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
    }


}

