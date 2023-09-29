package TicTacToe_game.vs.computer;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.*;
import static TicTacToe_game.setup.Computer3x3.Pc;
import static TicTacToe_game.setup.Computer3x3.computerMove;
import static TicTacToe_game.setup.WinnerCheck.checkWinner3x3;
import static TicTacToe_game.vs.computer.PlayerVsComputer3x3.playerMoveVSPC;
import static TicTacToe_game.vs.computer.PlayerVsComputer3x3.playerVsPc;

public class TheGameVsComputer3x3 {
    public static boolean gameVsPC3x3(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int counter3xpvpc = 1;
        while (true) {
            char[][] board = getChars3x3();
            while (run) {
                printBoard(board);
                System.out.println("Your tour " + playerVsPc);
                System.out.println("What is your move 1-9");
                try {
                    int pos = scan.nextInt();
                    while (playerPositions1O.contains(pos) || playerPositions2X.contains(pos)) {
                        System.out.println("Position taken");
                        pos = scan.nextInt();
                    }
                    playerMoveVSPC(board, playerPositions2X, pos);
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        counter3xpvpc++;
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run = false;
                        break;
                    }
                    System.out.println("yours tour " + Pc);
                    Random random = new Random();
                    int pcPos = random.nextInt(9) + 1;
                    computerMove(board, playerPositions1O, playerPositions2X, pcPos, random);
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run = false;
                        break;
                    }
                } catch (WrongMouve e) {
                    System.out.println("You can choose number from 1 to 9");
                }
            }
            int check = scan.nextInt();
            if (check == 1) {
                System.out.println("Game nr: " + counter3xpvpc);
                System.out.println("Your tour " + playerVsPc);
                playerPositions1O.clear();
                playerPositions2X.clear();
                run = true;
            }
            if (check == 2) {
                System.out.println("GAME OVER");
                break;
            }
        }
        return true;
    }
}
