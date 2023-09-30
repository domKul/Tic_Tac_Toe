package TicTacToe_game.mods.pvp;


import TicTacToe_game.exception.WrongMouve;
import TicTacToe_game.setup.Computer3x3;

import java.util.List;

public class PlayerVsPlayer3x3 {
    static char player3x3 = 'X';


    public static boolean playerMove(char[][] board, List<Integer> playerPositions2X,
                                     List<Integer> playerPositions1O, int pos) throws WrongMouve {
        if (pos > 9 || pos < 1) {
            throw new WrongMouve("Invalid move. Choose a number from 1 to 9.");
        }

        if (playerPositions1O.contains(pos) || playerPositions2X.contains(pos)) {
            System.out.println("Position taken");
            return false;
        }

        Computer3x3.pcPosition3x3(board, pos, player3x3);

        setPlayer3x3(playerPositions2X, playerPositions1O, pos);

        return true;
    }

    private static void setPlayer3x3(List<Integer> playerPositions2X, List<Integer> playerPositions1O, int pos) {
        if (player3x3 == 'X') {
            player3x3 = 'O';
            playerPositions2X.add(pos);
        } else {
            player3x3 = 'X';
            playerPositions1O.add(pos);
        }
    }


}












