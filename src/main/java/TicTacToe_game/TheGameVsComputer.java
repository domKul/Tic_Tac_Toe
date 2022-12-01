package TicTacToe_game;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe_game.Board.board;
import static TicTacToe_game.Board.checkWinner;
import static TicTacToe_game.Computer.PC;
import static TicTacToe_game.Computer.computerMove;
import static TicTacToe_game.PlayerVsComputer.playerMoveVSPC;
import static TicTacToe_game.PlayerVsComputer.playerVsPc;
import static TicTacToe_game.PlayerVsPlayer.player;
import static TicTacToe_game.PlayerVsPlayer.playerMove;

public class TheGameVsComputer {



    public static boolean gameVsPC(List<Integer> playerPositions1O, List<Integer> playerPositions2X) {
        Scanner scan = new Scanner(System.in);



        while (true) {
            Board.printBoard(board);
            checkWinner(playerPositions2X, playerPositions1O);
            System.out.println("yours tour " + playerVsPc);
            System.out.println("What is your move 1-9");
            try {
                int pos = scan.nextInt();
                playerMoveVSPC(board,playerPositions2X,playerPositions1O,pos);
                System.out.println("yours tour " + PC);
                Random random = new Random();

                int pcPos =random.nextInt(9)+1;
                computerMove(board,playerPositions1O,playerPositions2X,pcPos,pos,random);
                if (playerPositions1O.contains(pcPos) || playerPositions2X.contains(pos)) {
                    pcPos = random.nextInt(9) + 1;
                }

            } catch (WrongMouve e) {
                System.out.println("You can choose number from 1 to 9");
            }
        }
    }
}