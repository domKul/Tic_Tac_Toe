package TicTacToe_game;


import static TicTacToe_game.Board.playerPositions1O;
import static TicTacToe_game.Board.playerPositions2X;

public class MainGameClass {
    public static void main(String[] args) {
        System.out.println("Welcome in Tic Toc Toe");
        System.out.println();
       // TheGamePVP.gameRunning(playerPositions2X,playerPositions1O);
        TheGameVsComputer.gameVsPC(playerPositions2X,playerPositions1O);




    }
}









