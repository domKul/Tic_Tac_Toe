package TicTacToe_game;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.Board.*;
import static TicTacToe_game.Computer3x3.PC;

import static TicTacToe_game.Computer5x5.computerMove5x5;
import static TicTacToe_game.PlayerVsComputer5x5.playerMoveVSPC5x5;
import static TicTacToe_game.PlayerVsComputer5x5.playerVsPc5x5;

public class TheGameVsComputer5x5 {


    public static boolean gameVsPC5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            Board.printBoard(board2);
            checkWinner5x5(playerPositions2X, playerPositions1O);
            System.out.println("yours tour " + playerVsPc5x5);
            System.out.println("What is your move 1-25");
            try {
                int pos2 = scan.nextInt();
                while (playerPositions1O.contains(pos2) || playerPositions2X.contains(pos2)) {
                    System.out.println("Position taken");
                    pos2 = scan.nextInt();
                }
                playerMoveVSPC5x5(board2,playerPositions2X, pos2);
                System.out.println("yours tour " + PC);
                Random random = new Random();
                int pcPoss =random.nextInt(25)+1;
                computerMove5x5(board2,playerPositions1O,playerPositions2X,pcPoss,random);
            } catch (WrongMouve e) {
                System.out.println("You can choose number from 1 to 25");
            }
        }
    }
}
