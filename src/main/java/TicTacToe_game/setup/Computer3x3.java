package TicTacToe_game.setup;

import java.util.List;
import java.util.Random;


public class Computer3x3 {

    public static char Pc = 'O';

    public static boolean computerMove(char[][] board, List<Integer> playerPositions1O, List<Integer> playerPositions2X,
                                       int pcPos, Random random) {
        while (playerPositions1O.contains(pcPos) || playerPositions2X.contains(pcPos)) {
            pcPos = random.nextInt(9) + 1;
        }
        pcPosition3x3(board, pcPos, Pc);
        if (Pc == 'O') {
            playerPositions1O.add(pcPos);
        }

        return true;

    }

    public static void pcPosition3x3(char[][] board, int pcPos, char pc) {
        switch (pcPos) {
            case 1 -> board[0][0] = pc;
            case 2 -> board[0][2] = pc;
            case 3 -> board[0][4] = pc;
            case 4 -> board[2][0] = pc;
            case 5 -> board[2][2] = pc;
            case 6 -> board[2][4] = pc;
            case 7 -> board[4][0] = pc;
            case 8 -> board[4][2] = pc;
            case 9 -> board[4][4] = pc;
            default -> {
            }
        }
    }


}
