package TicTacToe_game.setup;

import java.util.List;
import java.util.Random;

public class Computer5x5 {

    static char PC = 'O';

    public static boolean computerMove5x5(char[][] board3, List<Integer> playerPositions1O, List<Integer> playerPositions2X,
                                          int pcPoss, Random random) {
        while (playerPositions1O.contains(pcPoss) || playerPositions2X.contains(pcPoss)) {
            pcPoss = random.nextInt(25) + 1;
        }
        pcPosition5x5(board3, pcPoss, PC);
        if (PC == 'O') {
            playerPositions1O.add(pcPoss);
        }
        return true;
    }

    public static void pcPosition5x5(char[][] board3, int pcPoss, char pc) {
        switch (pcPoss) {
            case 1 -> board3[0][0] = pc;
            case 2 -> board3[0][2] = pc;
            case 3 -> board3[0][4] = pc;
            case 4 -> board3[0][6] = pc;
            case 5 -> board3[0][8] = pc;
            case 6 -> board3[2][0] = pc;
            case 7 -> board3[2][2] = pc;
            case 8 -> board3[2][4] = pc;
            case 9 -> board3[2][6] = pc;
            case 10 -> board3[2][8] = pc;
            case 11 -> board3[4][0] = pc;
            case 12 -> board3[4][2] = pc;
            case 13 -> board3[4][4] = pc;
            case 14 -> board3[4][6] = pc;
            case 15 -> board3[4][8] = pc;
            case 16 -> board3[6][0] = pc;
            case 17 -> board3[6][2] = pc;
            case 18 -> board3[6][4] = pc;
            case 19 -> board3[6][6] = pc;
            case 20 -> board3[6][8] = pc;
            case 21 -> board3[8][0] = pc;
            case 22 -> board3[8][2] = pc;
            case 23 -> board3[8][4] = pc;
            case 24 -> board3[8][6] = pc;
            case 25 -> board3[8][8] = pc;
            default -> {
            }
        }
    }
}
