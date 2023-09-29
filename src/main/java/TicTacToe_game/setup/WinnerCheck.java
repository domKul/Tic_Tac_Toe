package TicTacToe_game.setup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static TicTacToe_game.setup.ListOfConditionsForWin.*;
import static TicTacToe_game.setup.ListOfConditionsForWin.cross22;

public class WinnerCheck {

    static List<List<Integer>> wC = new ArrayList<>();
    static List<List<Integer>> wC2 = new ArrayList<>();

    public static boolean checkWinner3x3(List<Integer> playerPositions2X, List<Integer> playerPositions1O) {
        wC.add(topRow3);
        wC.add(midRow3);
        wC.add(bottomrow3);
        wC.add(leftColumn3);
        wC.add(midColumn3);
        wC.add(rightColumn3);
        wC.add(crossOne3);
        wC.add(crossTwo3);
        if (checkPositionForWin3x3(playerPositions2X, playerPositions1O)) return false;
        return true;
    }

    private static boolean checkPositionForWin3x3(List<Integer> playerPositions2X, List<Integer> playerPositions1O) {
        for (List l : wC) {
            if (new HashSet<>(playerPositions1O).containsAll(l)) {
                System.out.println("You Win O");
                return true;
            } else if (playerPositions2X.size() + playerPositions1O.size() == 9) {
                System.out.println("No WInner");
                return true;
            } else if (playerPositions2X.containsAll(l)) {
                System.out.println("You Win X");
                return true;
            }
        }
        return false;
    }

    public static boolean checkWinner5x5(List<Integer> playerPositions2X, List<Integer> playerPositions1O) {
        wC2.add(row15);
        wC2.add(row25);
        wC2.add(row35);
        wC2.add(row45);
        wC2.add(row55);
        wC2.add(column15);
        wC2.add(column25);
        wC2.add(column35);
        wC2.add(column45);
        wC2.add(column55);
        wC2.add(cross12);
        wC2.add(cross22);
        if (checkPositionForWin5x5(playerPositions2X, playerPositions1O)) return false;
        return true;
    }

    private static boolean checkPositionForWin5x5(List<Integer> playerPositions2X, List<Integer> playerPositions1O) {
        for (List l : wC2) {
            if (playerPositions1O.containsAll(l)) {
                System.out.println("You Win O");
                return true;
            } else if (playerPositions2X.size() + playerPositions1O.size() == 25) {
                System.out.println("No WInner");
                return true;
            } else if (playerPositions2X.containsAll(l)) {
                System.out.println("You Win X");
                return true;
            }
        }
        return false;
    }
}
