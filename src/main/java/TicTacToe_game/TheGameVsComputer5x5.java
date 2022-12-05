package TicTacToe_game;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.Board.*;

import static TicTacToe_game.Computer3x3.Pc;
import static TicTacToe_game.Computer5x5.computerMove5x5;
import static TicTacToe_game.PlayerVsComputer5x5.playerMoveVSPC5x5;
import static TicTacToe_game.PlayerVsComputer5x5.playerVsPc5x5;

public class TheGameVsComputer5x5 {


    public static boolean gameVsPC5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int counter5xpvpc=1;
        while (true) {
            char[][] board3 = {{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                                 {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                               {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                               {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                               {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                               {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                               {'-', '+', '-', '+', '-', '+', '-', '+', '-'},
                               {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},};
            while (run) {
                printBoard(board3);
                System.out.println("yours tour " + playerVsPc5x5);
                System.out.println("What is your move 1-25");
                try {
                    int playerPosition = scan.nextInt();
                    while (playerPositions1O.contains(playerPosition) || playerPositions2X.contains(playerPosition)) {
                        System.out.println("Position taken");
                        playerPosition = scan.nextInt();
                    }
                    playerMoveVSPC5x5(board3,playerPositions2X, playerPosition);
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board3);
                        counter5xpvpc++;
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run=false;
                        break;
                    }
                   // System.out.println("yours tour " + PC);
                    Random random = new Random();
                    int pcPoss =random.nextInt(25)+1;
                    computerMove5x5(board3,playerPositions1O,playerPositions2X, pcPoss,random);
                    while (playerPositions1O.contains(pcPoss) || playerPositions2X.contains(pcPoss)) {
                        pcPoss =random.nextInt(25)+1;
                    }
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board3);
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run=false;
                        break;
                    }

                    System.out.println("yours tour " + Pc);
                } catch (WrongMouve e) {
                    System.out.println("You can choose number from 1 to 25");
                }
            }
            int toContinue = scan.nextInt();
            if (toContinue == 1) {
                System.out.println("Game nr: " +counter5xpvpc);
                System.out.println("Now is time for you to start " + playerVsPc5x5);
                playerPositions1O.clear();
                playerPositions2X.clear();
                run = true;
            }
            if (toContinue == 2) {
                System.out.println("GAME OVER");
                break;
            }
        }
        return true;
    }
}
