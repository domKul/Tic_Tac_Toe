package TicTacToe_game.mods.computer;

import TicTacToe_game.exception.WrongMouve;
import TicTacToe_game.setup.Computer3x3;

import java.util.List;

public class PlayerVsComputer3x3 {

    static char playerVsPc3x3 = 'X';

    public static boolean playerMoveVSPC(char[][] board, List<Integer> playerPositions2X,
                                         int pos) throws WrongMouve {

        if (pos > 9 || pos < 1) {
            throw new WrongMouve("Wrong position");
        }
        Computer3x3.pcPosition3x3(board, pos, playerVsPc3x3);
        if (playerVsPc3x3 == 'X') {
            playerPositions2X.add(pos);
        }
        return true;
    }
}
