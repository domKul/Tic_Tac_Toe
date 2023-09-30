package TicTacToe_game.mods.pvp;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;

import static TicTacToe_game.setup.Computer5x5.pcPosition5x5;

public class PlayerVsPlayer5x5 {


    public static char player5x5 = 'X';

    public static boolean playerMove5x5(char[][] board2, List<Integer> playerPositions2X,
                                        List<Integer> playerPositions1O, int posx) throws WrongMouve {
        if (posx > 25 || posx < 1) {
            throw new WrongMouve("Wrong posiotion");
        } else {
            while (playerPositions1O.contains(posx) || playerPositions2X.contains(posx)) {
                System.out.println("Position taken");
                return false;
            }
            pcPosition5x5(board2, posx,player5x5);
        }

        if (player5x5 == 'X') {
            player5x5 = 'O';
            playerPositions2X.add(posx);
        } else {
            player5x5 = 'X';
            playerPositions1O.add(posx);
        }
        return true;
    }



}
