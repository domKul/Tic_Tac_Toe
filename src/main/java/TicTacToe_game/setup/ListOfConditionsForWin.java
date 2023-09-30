package TicTacToe_game.setup;

import java.util.Arrays;
import java.util.List;

class ListOfConditionsForWin {
    //list for 3x3
    public static List<Integer> topRow3 = Arrays.asList(1, 2, 3);
    public static List<Integer> midRow3 = Arrays.asList(4, 5, 6);
    public static List<Integer> bottomrow3 = Arrays.asList(7, 8, 9);
    public static List<Integer> leftColumn3 = Arrays.asList(1, 4, 7);
    public static List<Integer> midColumn3 = Arrays.asList(2, 5, 8);
    public static List<Integer> rightColumn3 = Arrays.asList(3, 6, 9);
    public static List<Integer> crossOne3 = Arrays.asList(1, 5, 9);
    public static List<Integer> crossTwo3 = Arrays.asList(3, 5, 7);
    //////////////////
    //list for 5x5
    public static List<Integer> row15 = Arrays.asList(1, 2, 3, 4, 5);
    public static List<Integer> row25 = Arrays.asList(6, 7, 8, 9, 10);
    public static List<Integer> row35 = Arrays.asList(11, 12, 13, 14, 15);
    public static List<Integer> row45 = Arrays.asList(16, 17, 18, 19, 20);
    public static List<Integer> row55 = Arrays.asList(21, 22, 23, 24, 25);
    public static List<Integer> column15 = Arrays.asList(1, 6, 11, 16, 21);
    public static List<Integer> column25 = Arrays.asList(2, 7, 12, 17, 22);
    public static List<Integer> column35 = Arrays.asList(3, 8, 13, 18, 23);
    public static List<Integer> column45 = Arrays.asList(4, 9, 14, 19, 24);
    public static List<Integer> column55 = Arrays.asList(5, 10, 15, 20, 25);
    public static List<Integer> cross12 = Arrays.asList(1, 7, 13, 19, 25);
    public static List<Integer> cross22 = Arrays.asList(5, 9, 13, 17, 21);

}
