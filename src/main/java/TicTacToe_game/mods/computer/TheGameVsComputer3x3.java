package TicTacToe_game.mods.computer;

import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.mods.GameRunner;
import TicTacToe_game.setup.RunOptions;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.player.PlayerVsComputer3x3.playerMoveVSPC;
import static TicTacToe_game.player.PlayerVsComputer3x3.playerVsPc3x3;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.WinnerCheck.checkWinner3x3;
import static TicTacToe_game.setup.board.Board.board3x3;
import static TicTacToe_game.setup.board.Board.printBoard;
import static TicTacToe_game.setup.positions.ComputerPositions3x3.Pc;
import static TicTacToe_game.setup.positions.ComputerPositions3x3.computerMove;

public class TheGameVsComputer3x3 extends RandomGenerator implements GameRunner {

    private final RunOptions runOptions = new RunOptions();


    private static final int MAX_MOVE_NUMBER = 9;


    public void runGameMod(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner sc) throws WrongMove {
        gameLoopVsPc3x3(playerPositions1O, playerPositions2X, sc);
    }

    private void gameLoopVsPc3x3(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner sc) throws WrongMove {
        boolean run = true;
        int counter3xpvpc = 1;
        while (true) {
            char[][] board = board3x3();
            while (run) {
                printBoard(board);
                runOptions.tourIndicator(playerVsPc3x3);
                try {
                    int pos = getNext(sc, MAX_MOVE_NUMBER);
                    pos = isPositionTaken(playerPositions1O, playerPositions2X, sc, pos);
                    playerMoveVSPC(board, playerPositions2X, pos);
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        counter3xpvpc++;
                        run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
                        break;
                    }
                    System.out.println("yours tour " + Pc);
                    int pcPos = getRandom().nextInt(MAX_MOVE_NUMBER) + 1;
                    computerMove(board, playerPositions1O, playerPositions2X, pcPos, getRandom());
                    if (!checkWinner3x3(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board);
                        System.out.println("Do you want play again 1-yes, 100-no");
                        run = false;
                        break;
                    }
                } catch (WrongMove e) {
                    throw new WrongMove("You can choose number from 1 to 9" + e.getMessage());
                }
            }
            int toContinue = sc.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter3xpvpc, toContinue);
            if (gameOverOption(toContinue)) break;

        }
    }
}
