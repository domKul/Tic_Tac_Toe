package TicTacToe_game.mods.pvp;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.setup.Board.board5x5;
import static TicTacToe_game.setup.Board.printBoard;
import static TicTacToe_game.setup.RunOptions.*;
import static TicTacToe_game.setup.WinnerCheck.checkWinner5x5;
import static TicTacToe_game.mods.pvp.PlayerVsPlayer5x5.player5x5;
import static TicTacToe_game.mods.pvp.PlayerVsPlayer5x5.playerMove5x5;


public class TheGamePVP5x5 {

    private static final int MAX_MOVE_NUMER = 25;

    public static void gameRunning5x5(List<Integer> playerPositions1O, List<Integer> playerPositions2X) throws WrongMouve {
        Scanner scan2 = new Scanner(System.in);
        boolean run = true;
        int counter5xpvp = 1;
        while (true) {
            char[][] board2 = board5x5();

            while (run) {
                printBoard(board2);
                tourIndicator(player5x5);
                try {
                    int pos = getNext(scan2,MAX_MOVE_NUMER);
                    playerMove5x5(board2, playerPositions2X, playerPositions1O, pos);
                    if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
                        System.out.println();
                        printBoard(board2);
                        counter5xpvp++;
                        run = afterWinOrLosePvp(playerPositions1O, playerPositions2X, run);
                    }
                } catch (WrongMouve e) {
                    throw new WrongMouve("You can choose number from 1 to 25" + e.getMessage());
                }
            }
            int next = scan2.nextInt();
            run = isRun(playerPositions1O, playerPositions2X, run, counter5xpvp, next);
            if (gameOverOption(next)) break;
        }
    }

}
