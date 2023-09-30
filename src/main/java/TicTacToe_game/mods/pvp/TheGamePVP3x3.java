package TicTacToe_game.mods.pvp;


import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.board3x3;
import static TicTacToe_game.setup.Board.printBoard;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.mods.pvp.PlayerVsPlayer3x3.player3x3;
import static TicTacToe_game.mods.pvp.PlayerVsPlayer3x3.playerMove;


public class TheGamePVP3x3 {
    private static final int MAX_MOVE_NUMER = 9;
    static int counter3xpvp = 1;

    public static void gameRunning(List<Integer> playerPositions1O, List<Integer> playerPositions2X) throws WrongMouve {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            char[][] board = board3x3();

            while (run) {
                printBoard(board);
                tourIndicator(player3x3);
                try {
                    int pos = getNext(scan,MAX_MOVE_NUMER);
                    playerMove(board, playerPositions2X, playerPositions1O, pos);

                } catch (WrongMouve e) {
                    throw new WrongMouve("You can choose number from 1 to 9" + e.getMessage());
                }
                run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
            }
            int next = scan.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter3xpvp, next);
            if (gameOverOption(next)) break;
        }
    }


}








