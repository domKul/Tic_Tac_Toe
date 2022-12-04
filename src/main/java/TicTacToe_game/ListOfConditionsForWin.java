package TicTacToe_game;

import java.util.Arrays;
import java.util.List;

public class ListOfConditionsForWin {
    //list for 3x3
    static List topRow3 = Arrays.asList(1,2,3);
    static List midRow3 = Arrays.asList(4,5,6);
    static List bottomrow3 = Arrays.asList(7,8,9);
    static List leftColumn3 = Arrays.asList(1,4,7);
    static List midColumn3 = Arrays.asList(2,5,8);
    static List rightColumn3 = Arrays.asList(3,6,9);
    static List crossOne3 = Arrays.asList(1,5,9);
    static List crossTwo3 = Arrays.asList(3,5,7);
    //////////////////
    //list for 5x5
    static List row15 = Arrays.asList(1,2,3,4,5);
    static List row25 = Arrays.asList(6,7,8,9,10);
    static List row35 = Arrays.asList(11,12,13,14,15);
    static List row45 = Arrays.asList(16,17,18,19,20);
    static List row55 = Arrays.asList(21,22,23,24,25);
    static List column15 = Arrays.asList(1,6,11,16,21);
    static List column25 = Arrays.asList(2,7,12,17,22);
    static List column35 = Arrays.asList(3,8,13,18,23);
    static List column45 = Arrays.asList(4,9,14,19,24);
    static List column55 = Arrays.asList(5,10,15,20,25);
    static List cross12 = Arrays.asList(1,7,13,19,25);
    static List cross22 = Arrays.asList(5,9,13,17,21);

}
