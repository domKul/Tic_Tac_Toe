package TicTacToe_game;


import java.util.Scanner;

public class Player extends Board{
    static char player ='X';

    public static char getPlayer() {
        return player;
    }

    public static boolean playerMoves(char board [][], char player){
        System.out.println(player + " Your tour");
        System.out.println("What is you move (number of line 0-2)");
        int line = new Scanner(System.in).nextInt();
        System.out.println("What is you move (number of column 0-2)");
        int column = new Scanner(System.in).nextInt();
        boolean rightmove= Board.board[line][column]==' ';
        if(!rightmove){
            System.out.println("Wrong move");
            return false;
        }
        Board.board[line][column]=player;
        return true;


    }


    }





