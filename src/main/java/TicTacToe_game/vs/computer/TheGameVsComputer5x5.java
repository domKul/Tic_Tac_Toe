package TicTacToe_game.vs.computer;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.board5x5;
import static TicTacToe_game.setup.Board.printBoard;
import static TicTacToe_game.setup.Computer3x3.Pc;
import static TicTacToe_game.setup.Computer5x5.computerMove5x5;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.WinnerCheck.checkWinner5x5;
import static TicTacToe_game.vs.computer.PlayerVsComputer5x5.playerMoveVSPC5x5;
import static TicTacToe_game.vs.computer.PlayerVsComputer5x5.playerVsPc5x5;

public class TheGameVsComputer5x5 {

    private static final int MAX_MOVE_NUMER = 25;

    public static boolean gameVsPC5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) throws WrongMouve {
        Scanner scan = new Scanner(System.in);

        gameLoopVsPc5x5(playerPositions1O, playerPositions2X, scan);
        return true;
    }

    private static void gameLoopVsPc5x5(List<Integer> playerPositions1O,
                                        List<Integer> playerPositions2X,
                                        Scanner scan) throws WrongMouve {
        boolean run = true;
        int counter5xpvpc = 1;
        while (true) {
            char[][] board3 = board5x5();
            while (run) {
                printBoard(board3);
                tourIndicator(playerVsPc5x5);
                try {
                    int playerPosition = getNext(scan,MAX_MOVE_NUMER);
                    playerPosition = isPositionTaken(playerPositions1O, playerPositions2X, scan, playerPosition);
                    playerMoveVSPC5x5(board3, playerPositions2X, playerPosition);
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board3);
                        System.out.println("Do you want play again 1-yes, 2-no");
                        run = false;
                        break;
                    }
                    Random random = new Random();
                    int pcPoss = random.nextInt(25) + 1;
                    computerMove5x5(board3, playerPositions1O, playerPositions2X, pcPoss, random);
                    while (playerPositions1O.contains(pcPoss) || playerPositions2X.contains(pcPoss)) {
                        pcPoss = random.nextInt(25) + 1;
                    }
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board3);
                        run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
                        break;
                    }

                    System.out.println("your tour " + Pc);
                } catch (WrongMouve e) {
                    throw new WrongMouve("You can choose number from 1 to 25" + e.getMessage());
                }
            }
            int toContinue = getNext(scan,MAX_MOVE_NUMER);
            run = isRun(playerPositions1O, playerPositions2X, run, counter5xpvpc, toContinue);
            if (gameOverOption(toContinue)) break;
        }
    }


}
