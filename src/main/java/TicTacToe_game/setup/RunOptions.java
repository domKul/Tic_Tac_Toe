package TicTacToe_game.setup;

import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.setup.WinnerCheck.checkWinner3x3;
import static TicTacToe_game.setup.WinnerCheck.checkWinner5x5;
import static TicTacToe_game.vs.computer.PlayerVsComputer5x5.playerVsPc5x5;

public class RunOptions {

    public static boolean gameOverOption(int toContinue) {
        if (toContinue == 2) {
            System.out.println("GAME OVER");
            return true;
        }
        return false;
    }



    public static boolean isRun(List<Integer> playerPositions1O,
                                List<Integer> playerPositions2X,
                                boolean run, int counter5xpvpc,
                                int toContinue) {
        if (toContinue == 1) {

            System.out.println("Game nr: " + counter5xpvpc);
            System.out.println("Now is time for you to start " + playerVsPc5x5);
            playerPositions1O.clear();
            playerPositions2X.clear();
            run = true;
        }
        return run;
    }

    public static boolean afterWinOrLosePvp(List<Integer> playerPositions1O,
                                            List<Integer> playerPositions2X,
                                            boolean run) {
        if (!checkWinner5x5(playerPositions2X, playerPositions1O)) {
            System.out.println("Do you want play again 1-yes, 2-no");
            run = false;
        }
        return run;
    }


    public static int getNext(Scanner scan, int maxNumber) {
        int move;
        do {
            System.out.println("Enter your move (1-" + maxNumber + ") or stop 100 :");
            move = scan.nextInt();
        } while (move < 1 || move > maxNumber);
        return move;
    }

    public static <T> void tourIndicator(T player) {
        System.out.println("yours tour " + player);
    }

    public static int isPositionTaken(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner scan, int pos) {
        while (playerPositions1O.contains(pos) || playerPositions2X.contains(pos)) {
            System.out.println("Position taken");
            pos = scan.nextInt();
        }
        return pos;
    }
}
