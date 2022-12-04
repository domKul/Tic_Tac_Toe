package TicTacToe_game;

import java.util.Scanner;

import static TicTacToe_game.Board.playerPositions1O;
import static TicTacToe_game.Board.playerPositions2X;

public class GameStart {

    public static void choseGame(){
        Scanner scanner= new Scanner(System.in);

       try{ int boards = scanner.nextInt();
        if (boards == 3){
            System.out.println("You choose 3x3 board to play, what mod you want to play 1- Vesrus Pc or 2- Versus PLayer");
            int gameMod = scanner.nextInt();
            if (gameMod ==2){
                System.out.println("Player vs Player");
            TheGamePVP3x3.gameRunning(playerPositions1O,playerPositions2X);
            }else if(gameMod ==1){
                System.out.println("Player vs PC");
                TheGameVsComputer3x3.gameVsPC3x3(playerPositions1O,playerPositions2X);
            }
        } else if (boards ==5){
            System.out.println("You choose 5x5 board to play, what mod you want to play 1- Vesrus Pc or 2- Versus PLayer");
            int gameMod1 = scanner.nextInt();
            if (gameMod1==2){
           TheGamePVP5x5.gameRunning5x5(playerPositions1O,playerPositions2X);
            } else if (gameMod1==1) {
                TheGameVsComputer5x5.gameVsPC5x5(playerPositions1O,playerPositions2X);
            }
        }}catch (WrongMouve e){
           System.out.println("www");
       }
    }
}
