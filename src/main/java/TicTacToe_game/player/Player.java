package TicTacToe_game.player;

import TicTacToe_game.exception.ExceptionMessages;
import TicTacToe_game.exception.WrongMove;

import java.util.List;

import static TicTacToe_game.setup.GameStart.playerPositions1O;
import static TicTacToe_game.setup.GameStart.playerPositions2X;

class Player implements PlayerSettings{

    private char playerMark;

    public Player(char playerMark) {
        this.playerMark = playerMark;
    }

    public char getPlayerMark() {
        return playerMark;
    }

    public void setPlayerMark(char playerMark) {
        this.playerMark = playerMark;
    }

    public void playerMoveChecker(int pos, int min, int max, ExceptionMessages exceptionMessages) throws WrongMove {
        if (pos > max || pos < min) {
            throw new WrongMove(exceptionMessages.getErrorMessage());
        }
    }

     public boolean playerPositionChecker(int pos){
        if (playerPositions1O.contains(pos) || playerPositions2X.contains(pos)) {
            System.out.println("Position taken");
            return false;
        }
        return true;
    }

     public void playerMarkSwitcher(List<Integer> playerPositions2X, List<Integer> playerPositions1O, int pos, char player) {
        if (player == 'X') {
            player = 'O';
            playerPositions2X.add(pos);
        } else {
            player = 'X';
            playerPositions1O.add(pos);
        }
    }

}
