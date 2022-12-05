package TicTacToe_game;

import java.util.List;

import static TicTacToe_game.PlayerVsPlayer5x5.player5x5;

public class PlayerVsComputer5x5 {
    static char playerVsPc5x5 ='X';

    public static boolean playerMoveVSPC5x5(char[][] board2, List<Integer> playerPositions2X,
                                         int poss)throws WrongMouve {

        if (poss > 25 || poss < 1) {
            throw new WrongMouve();
        }
        switch (poss) {
            case 1 -> board2[0][0] = player5x5;
            case 2 -> board2[0][2] = player5x5;
            case 3 -> board2[0][4] = player5x5;
            case 4 -> board2[0][6] = player5x5;
            case 5 -> board2[0][8] = player5x5;
            case 6 -> board2[2][0] = player5x5;
            case 7 -> board2[2][2] = player5x5;
            case 8 -> board2[2][4] = player5x5;
            case 9 -> board2[2][6] = player5x5;
            case 10 -> board2[2][8] = player5x5;
            case 11 -> board2[4][0] = player5x5;
            case 12 -> board2[4][2] = player5x5;
            case 13 -> board2[4][4] = player5x5;
            case 14 -> board2[4][6] = player5x5;
            case 15 -> board2[4][8] = player5x5;
            case 16 -> board2[6][0] = player5x5;
            case 17 -> board2[6][2] = player5x5;
            case 18 -> board2[6][4] = player5x5;
            case 19 -> board2[6][6] = player5x5;
            case 20 -> board2[6][8] = player5x5;
            case 21 -> board2[8][0] = player5x5;
            case 22 -> board2[8][2] = player5x5;
            case 23 -> board2[8][4] = player5x5;
            case 24 -> board2[8][6] = player5x5;
            case 25 -> board2[8][8] = player5x5;
            default -> {
            }
        }

        if (playerVsPc5x5 == 'X') {
            playerPositions2X.add(poss);

        }
        return true;
    }
}
