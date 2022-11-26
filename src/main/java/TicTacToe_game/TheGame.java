package TicTacToe_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static TicTacToe_game.Board.board;
import static TicTacToe_game.Board.checkWinner;


public class TheGame {

    public static String gameRunning(){
        while(true){
            Board.printBoard(board);
            String reslut =checkWinner();
            Player.playerMove();
            System.out.println(reslut);




        }










    }
    }








