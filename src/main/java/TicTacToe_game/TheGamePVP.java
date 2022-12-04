package TicTacToe_game;


import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.Board.*;
import static TicTacToe_game.PlayerVsPlayer.player;
import static TicTacToe_game.PlayerVsPlayer.playerMove;


public class TheGamePVP {

    public static boolean gameRunning(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);

        while(true){
            Board.printBoard(board);
            checkWinner3x3(playerPositions2X,playerPositions1O);
            System.out.println("yours tour " + player);
            System.out.println("What is your move 1-9");
            try{
                int pos = scan.nextInt();
                playerMove(board,playerPositions2X,playerPositions1O,pos);
                if (!checkWinner3x3(playerPositions2X, playerPositions1O)){
                    printBoard(board);
                    return false;
                }
            }catch (WrongMouve e){
                System.out.println("You can choose number from 1 to 9");

            }

        }


    }


    }








