package TicTacToe_game.setup;

import TicTacToe_game.exception.WrongMove;
import TicTacToe_game.mods.GameRunner;
import TicTacToe_game.mods.computer.TheGameVsComputer3x3;
import TicTacToe_game.mods.computer.TheGameVsComputer5x5;
import TicTacToe_game.mods.pvp.TheGamePVP3x3;
import TicTacToe_game.mods.pvp.TheGamePVP5x5;

import java.util.ArrayList;
import java.util.List;


public class GameStart {

    private final GameRunner theGameVsComputer3x3 = new TheGameVsComputer3x3();
    private final GameRunner theGamePVP3x3 = new TheGamePVP3x3();
    private final GameRunner theGamePVP5x5=  new TheGamePVP5x5();
    private final GameRunner theGameVsComputer5x5 = new TheGameVsComputer5x5();
    private final ScannerManager scannerManager = new ScannerManager();

    public static List<Integer> playerPositions1O = new ArrayList<>();
    public static List<Integer> playerPositions2X = new ArrayList<>();



    public void choseGame() throws WrongMove {
        int boards = scannerManager.getSc().nextInt();

        if (boards == 3) {
            System.out.println("You choose 3x3 board to play, what mod you want to play 1- Vesrus Pc or 2- Versus PLayer");
            int gameMod = scannerManager.getSc().nextInt();
            if (gameMod == 2) {
                System.out.println("PlayerSettings vs PlayerSettings");
                theGamePVP3x3.runGameMod(playerPositions1O, playerPositions2X, scannerManager.getSc());
            } else if (gameMod == 1) {
                System.out.println("PlayerSettings vs PC");
                theGameVsComputer3x3.runGameMod(playerPositions1O, playerPositions2X, scannerManager.getSc());
            }
        } else if (boards == 5) {
            System.out.println("You choose 5x5 board to play, what mod you want to play 1- Vesrus Pc or 2- Versus PLayer");
            int gameMod1 = scannerManager.getSc().nextInt();
            if (gameMod1 == 2) {
                theGamePVP5x5.runGameMod(playerPositions1O, playerPositions2X, scannerManager.getSc());
            } else if (gameMod1 == 1) {
                theGameVsComputer5x5.runGameMod(playerPositions1O, playerPositions2X,scannerManager.getSc());
            }
        }
    }

}
