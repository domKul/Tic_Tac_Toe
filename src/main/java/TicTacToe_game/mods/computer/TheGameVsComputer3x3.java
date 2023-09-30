package TicTacToe_game.mods.computer;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.board3x3;
import static TicTacToe_game.setup.Board.printBoard;
import static TicTacToe_game.setup.Computer3x3.Pc;
import static TicTacToe_game.setup.Computer3x3.computerMove;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.WinnerCheck.checkWinner3x3;
import static TicTacToe_game.mods.computer.PlayerVsComputer3x3.playerMoveVSPC;
import static TicTacToe_game.mods.computer.PlayerVsComputer3x3.playerVsPc3x3;

public class TheGameVsComputer3x3 {

    private static final int MAX_MOVE_NUMER = 9;

    public static void gameVsPC3x3(List<Integer> playerPositions1O, List<Integer> playerPositions2X) throws WrongMouve {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int counter3xpvpc = 1;
        while (true) {
            char[][] board = board3x3();
            while (run) {
                printBoard(board);
                tourIndicator(playerVsPc3x3);
                try {
                    int pos = getNext(scan,MAX_MOVE_NUMER);
                    pos = isPositionTaken(playerPositions1O, playerPositions2X, scan, pos);
                    playerMoveVSPC(board, playerPositions2X, pos);
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        counter3xpvpc++;
                        run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
                        break;
                    }
                    System.out.println("yours tour " + Pc);
                    Random random = new Random();
                    int pcPos = random.nextInt(9) + 1;
                    computerMove(board, playerPositions1O, playerPositions2X, pcPos, random);
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        System.out.println("Do you want play again 1-yes, 100-no");
                        run = false;
                        break;
                    }
                } catch (WrongMouve e) {
                    throw new WrongMouve("You can choose number from 1 to 9" + e.getMessage());
                }
            }
            int toContinue = scan.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter3xpvpc, toContinue);
            if (gameOverOption(toContinue)) break;

        }
    }
}
