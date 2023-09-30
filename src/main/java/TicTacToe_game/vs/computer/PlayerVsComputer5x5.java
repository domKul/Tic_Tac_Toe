package TicTacToe_game.vs.computer;

import TicTacToe_game.exception.WrongMouve;
import TicTacToe_game.setup.Computer5x5;

import java.util.List;

import static TicTacToe_game.vs.pvp.PlayerVsPlayer5x5.player5x5;

public class PlayerVsComputer5x5 {
    public static char playerVsPc5x5 = 'X';

    public static boolean playerMoveVSPC5x5(char[][] board2, List<Integer> playerPositions2X,
                                            int poss) throws WrongMouve {

        if (poss > 25 || poss < 1) {
            throw new WrongMouve("Wrong position");
        }
        Computer5x5.pcPosition5x5(board2, poss, player5x5);

        if (playerVsPc5x5 == 'X') {
            playerPositions2X.add(poss);

        }
        return true;
    }
}
