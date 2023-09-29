package TicTacToe_game.vs.computer;

import TicTacToe_game.setup.Computer3x3;
import TicTacToe_game.exception.WrongMouve;

import java.util.List;

public class PlayerVsComputer3x3 {

    static char playerVsPc = 'X';

    public static boolean playerMoveVSPC(char[][] board, List<Integer> playerPositions2X,
                                         int pos) throws WrongMouve {

        if (pos > 9 || pos < 1) {
            throw new WrongMouve();
        }
        Computer3x3.pcPosition3x3(board, pos, playerVsPc);
        if (playerVsPc == 'X') {
            playerPositions2X.add(pos);
        }
        return true;
    }
}
