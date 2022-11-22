package TicTacToe_game;

public  class Board {
     static char [][] board = {{' ', ' ', ' '},
                               {' ', ' ', ' '},
                               {' ', ' ', ' '}};
    public static void printBoard(char[][]board){
        System.out.println(" \t0\t1\t2");
        for (int line = 0; line<board.length; line++){
            System.out.print(line + " ");
            for (int column = 0;column<board[line].length; column++){
                System.out.print(" |" +board[line][column]+ "|");
            }
            System.out.println();
        }
    }

}
