package TicTacToe_game;

import java.util.ArrayList;
import java.util.List;

import static TicTacToe_game.Board.*;
import static TicTacToe_game.Player.playerMove;


public class TheGame {

    public static boolean gameRunning(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        while(true){
            Board.printBoard(board);
            checkWinner(playerPositions2X,playerPositions1O);
            try{
                playerMove(board,playerPositions2X,playerPositions1O);
           /* if (checkWinner()==false){
                printBoard(board);
                return false;
            }
            */}catch (WrongMouve e){
                System.out.println("You can choose number from 1 to 9");
                return false;
            }

        }
    }



    }








