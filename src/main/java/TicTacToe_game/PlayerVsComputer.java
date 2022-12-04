package TicTacToe_game;

import java.util.List;

public class PlayerVsComputer {

    static char playerVsPc ='X';

    public static boolean playerMoveVSPC(char[][] board, List<Integer> playerPositions2X,
                                     int pos)throws WrongMouve {

        if (pos > 9 || pos < 1) {
            throw new WrongMouve();
        }
            switch (pos) {
                case 1 -> board[0][0] = playerVsPc;
                case 2 -> board[0][2] = playerVsPc;
                case 3 -> board[0][4] = playerVsPc;
                case 4 -> board[2][0] = playerVsPc;
                case 5 -> board[2][2] = playerVsPc;
                case 6 -> board[2][4] = playerVsPc;
                case 7 -> board[4][0] = playerVsPc;
                case 8 -> board[4][2] = playerVsPc;
                case 9 -> board[4][4] = playerVsPc;
                default -> {
                }
            }


            if (playerVsPc == 'X') {
                playerPositions2X.add(pos);
            }
            return true;
        }
}
