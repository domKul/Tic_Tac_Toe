package TicTacToe_game.mods.pvp;


import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.mods.GameRunner;
import TicTacToe_game.player.PlayerVsPlayer3x3;
import TicTacToe_game.setup.RunOptions;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.board.Board.board3x3;
import static TicTacToe_game.setup.board.Board.printBoard;


public class TheGamePVP3x3 implements GameRunner {

    private final PlayerVsPlayer3x3 pvp3x3 = new PlayerVsPlayer3x3();
    private final RunOptions runOptions = new RunOptions();

    private static final int MAX_MOVE_NUMER = 9;
    static int counter3xpvp = 1;


    public void runGameMod(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner sc) throws WrongMove {
        boolean run = true;
        while (run) {
            char[][] board = board3x3();

            while (run) {
                printBoard(board);
                runOptions.tourIndicator(pvp3x3.getPlayer3x3());
                try {
                    int pos = getNext(sc, MAX_MOVE_NUMER);
                    pvp3x3.playerMove(board, playerPositions2X, playerPositions1O, pos);
                    run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);

                } catch (WrongMove e) {
                    throw new WrongMove("You can choose number from 1 to 9" + e.getMessage());
                }
            }
            int next = sc.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter3xpvp, next);
            if (gameOverOption(next)) break;
        }
    }
}








