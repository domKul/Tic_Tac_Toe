package TicTacToe_game.mods.pvp;

import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.mods.GameRunner;
import TicTacToe_game.setup.RunOptions;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.player.PlayerVsPlayer5x5.player5x5;
import static TicTacToe_game.player.PlayerVsPlayer5x5.playerMove5x5;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.WinnerCheck.checkWinner5x5;
import static TicTacToe_game.setup.board.Board.board5x5;
import static TicTacToe_game.setup.board.Board.printBoard;


 public class TheGamePVP5x5 implements GameRunner {

    private static final int MAX_MOVE_NUMBER = 25;
    private final RunOptions runOptions = new RunOptions();

    public void runGameMod(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner sc) throws WrongMove {
        boolean run = true;
        int counter5xpvp = 1;
        while (true) {
            char[][] board2 = board5x5();
            while (run) {
                printBoard(board2);
                runOptions.tourIndicator(player5x5);
                try {
                    int pos = getNext(sc, MAX_MOVE_NUMBER);
                    playerMove5x5(board2, playerPositions2X, playerPositions1O, pos);
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board2);
                        counter5xpvp++;
                        run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
                    }
                } catch (WrongMove e) {
                    throw new WrongMove("You can choose number from 1 to 25" + e.getMessage());
                }
            }
            int next = sc.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter5xpvp, next);
            if (gameOverOption(next)) break;
        }
    }
}
