package TicTacToe_game;


import java.util.List;
import java.util.Scanner;


import static TicTacToe_game.Board.*;
import static TicTacToe_game.PlayerVsPlayer3x3.player;
import static TicTacToe_game.PlayerVsPlayer3x3.playerMove;


public class TheGamePVP3x3 {
    static int counter3xpvp =1;
    public static boolean gameRunning(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            char[][] board = {{' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '}};

            while (run) {
                printBoard(board);
                System.out.println("yours tour " + player);
                System.out.println("What is your move 1-9");

                try {
                    int pos = scan.nextInt();
                    playerMove(board, playerPositions2X, playerPositions1O, pos);

                } catch (WrongMouve e) {
                    System.out.println("You can choose number from 1 to 9");
                }
                if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                    System.out.println("Do you want play again 1-yes, 2-no");
                    run = false;
                    counter3xpvp++;
                }
            }
            int next = scan.nextInt();
            if (next == 1) {
                System.out.println("Game Number : " + counter3xpvp);
                System.out.println("Now is time for you to start " + player);
                playerPositions1O.clear();
                playerPositions2X.clear();
                run = true;

            }
            if (next == 2) {
                System.out.println("GAME OVER");
                break;

            }
        }
        return true;
    }



}








