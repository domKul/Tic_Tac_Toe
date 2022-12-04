package TicTacToe_game;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.Board.*;
import static TicTacToe_game.PlayerVsPlayer5x5.player5x5;
import static TicTacToe_game.PlayerVsPlayer5x5.playerMove5x5;


public class TheGamePVP5x5 {

    public static boolean gameRunning5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            Board.printBoard(board2);
            checkWinner5x5(playerPositions2X, playerPositions1O);
            System.out.println("Yours tour " + player5x5);
            System.out.println("What is your move 1-25");
            try {
                int posx = scan.nextInt();
                playerMove5x5(board2, playerPositions2X, playerPositions1O, posx);
                if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                    printBoard(board2);
                    return false;
                }
            } catch (WrongMouve e) {
                System.out.println("You can choose number from 1 to 25");

            }

        }
    }


}
