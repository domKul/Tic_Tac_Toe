package TicTacToe_game.mods;

import TicTacToe_game.exception.WrongMove;

import java.util.List;
import java.util.Scanner;

public interface GameRunner {

    void runGameMod(List<Integer> playerPositions1O, List<Integer> playerPositions2X, Scanner sc) throws WrongMove;
}
