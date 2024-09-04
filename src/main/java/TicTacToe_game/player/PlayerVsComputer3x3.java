package TicTacToe_game.player;

import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.setup.positions.ComputerPositions3x3;

import java.util.List;

public class PlayerVsComputer3x3 {

    public static char playerVsPc3x3 = 'X';

    public static boolean playerMoveVSPC(char[][] board, List<Integer> playerPositions2X,
                                         int pos) throws WrongMove {

        if (pos > 9 || pos < 1) {
            throw new WrongMove("Wrong position");
        }
        ComputerPositions3x3.pcPosition3x3(board, pos, playerVsPc3x3);
        if (playerVsPc3x3 == 'X') {
            playerPositions2X.add(pos);
        }
        return true;
    }
}
