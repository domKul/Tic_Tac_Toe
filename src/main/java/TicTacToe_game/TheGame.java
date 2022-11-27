package TicTacToe_game;

import static TicTacToe_game.Board.*;


public class TheGame {

    public static boolean gameRunning(){
        while(true){
            Board.printBoard(board);
            checkWinner();
            Player.playerMove();
            if (checkWinner()==false){
                printBoard(board);
                return false;
            }
        }
    }



    }








