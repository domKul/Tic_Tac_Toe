package TicTacToe_game.vs.pvp;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.getChars5x5;
import static TicTacToe_game.setup.Board.printBoard;
import static TicTacToe_game.setup.WinnerCheck.checkWinner5x5;
import static TicTacToe_game.vs.pvp.PlayerVsPlayer3x3.player;
import static TicTacToe_game.vs.pvp.PlayerVsPlayer5x5.player5x5;
import static TicTacToe_game.vs.pvp.PlayerVsPlayer5x5.playerMove5x5;


public class TheGamePVP5x5 {

    public static boolean gameRunning5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan2 = new Scanner(System.in);
        boolean run = true;
        int counter5xpvp = 1;
        while (true) {
            char[][] board2 = getChars5x5();

            while (run) {
                printBoard(board2);
                System.out.println("yours tour " + player5x5);
                System.out.println("What is your move 1-25");
                try {
                    int pos = getWn(scan2);
                    playerMove5x5(board2, playerPositions2X, playerPositions1O, pos);
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board2);
                        counter5xpvp++;
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run = false;
                    }
                } catch (WrongMouve e) {
                    System.out.println("You can choose number from 1 to 25");
                }
            }
            int wn = getWn(scan2);
            if (wn == 1) {
                System.out.println("Game nr: " + counter5xpvp);
                System.out.println("Now is time for you to start " + player);
                playerPositions1O.clear();
                playerPositions2X.clear();
                run = true;

            }
            if (wn == 2) {

                System.out.println("GAME OVER");
                break;

            }
        }
        return true;
    }

    private static int getWn(Scanner scan2) {
        int wn = scan2.nextInt();
        return wn;
    }


}
