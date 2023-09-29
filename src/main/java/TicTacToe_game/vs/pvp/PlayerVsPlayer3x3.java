package TicTacToe_game.vs.pvp;


import TicTacToe_game.setup.Computer3x3;
import TicTacToe_game.exception.WrongMouve;

import java.util.List;

public class PlayerVsPlayer3x3 {
    static char player = 'X';


    public static boolean playerMove(char[][] board, List<Integer> playerPositions2X,
                                     List<Integer> playerPositions1O, int pos) throws WrongMouve {
        if (pos > 9 || pos < 1) {
            throw new WrongMouve();
        } else {
            while (playerPositions1O.contains(pos) || playerPositions2X.contains(pos)) {
                System.out.println("Position taken");
                return false;
            }
            Computer3x3.pcPosition3x3(board, pos, player);
            if (player == 'X') {
                player = 'O';
                playerPositions2X.add(pos);
            } else {
                player = 'X';
                playerPositions1O.add(pos);
            }
            return true;
        }
    }


}












