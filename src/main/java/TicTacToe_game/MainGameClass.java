package TicTacToe_game;


import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.setup.GameStart;

public class MainGameClass {
    public static void main(String[] args) throws WrongMove {


        GameStart gameStart = new GameStart();

        System.out.println("Welcome in Tic Toc Toe version 1.0");
        System.out.println();
        System.out.println("What board size you want, type 3 for 3x3, type 5 for 5x5 or stop type 100");
        gameStart.choseGame();


    }
}









