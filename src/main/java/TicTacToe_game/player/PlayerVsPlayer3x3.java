package TicTacToe_game.player;


import TicTacToe_game.exception.ExceptionMessages;
import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.setup.positions.ComputerPositions3x3;

import java.util.List;

public class PlayerVsPlayer3x3 {

    private char player3x3 = 'X';


    private final Player player = new Player(player3x3);


    public boolean playerMove(char[][] board, List<Integer> playerPositions2X,
                              List<Integer> playerPositions1O, int pos) throws WrongMove {
        player.playerMoveChecker(pos, 1, 9, ExceptionMessages.INVALID_MOVE_NUMBER_3X3);
        boolean position = player.playerPositionChecker(pos);
        ComputerPositions3x3.pcPosition3x3(board, pos, player3x3);
        player.playerMarkSwitcher(playerPositions2X, playerPositions1O, pos, player3x3);
        return position;
    }

    public char getPlayer3x3() {
        return player3x3;
    }
}












