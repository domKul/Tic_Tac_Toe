package TicTacToe_game.player;

import TicTacToe_game.exception.ExceptionMessages;
import TicTacToe_game.exception.WrongMove;

import java.util.List;

 interface PlayerSettings {

     void playerMarkSwitcher(List<Integer> playerPositions2X, List<Integer> playerPositions1O, int pos,char player);
     boolean playerPositionChecker(int pos);
     void playerMoveChecker(int pos, int min, int max, ExceptionMessages exceptionMessages) throws WrongMove;
}
