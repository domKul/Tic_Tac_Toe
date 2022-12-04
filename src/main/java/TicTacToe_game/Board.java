package TicTacToe_game;


import java.util.ArrayList;
import java.util.List;

import static TicTacToe_game.ListOfConditionsForWin.*;

public  class Board {
    static List<Integer> playerPositions1O = new ArrayList<>();
     static List<Integer> playerPositions2X = new ArrayList<>();

    static List<List>wC = new ArrayList<>();
    static List<List>wC2 = new ArrayList<>();


    static char [][] board = {{' ', '|', ' ', '|', ' '},
                               {'-', '+', '-','+','-'},
                               {' ', '|', ' ', '|', ' '},
                               {'-', '+', '-', '+','-' },
                               {' ', '|', ' ', '|', ' '}};

    static char [][] board2 = {{' ','|',' ', '|',' ','|',' ','|',' '},
                               {'-','+','-','+','-','+','-','+','-'},
                               {' ','|',' ', '|',' ','|',' ','|',' '},
                               {'-','+','-','+','-','+','-','+','-'},
                               {' ','|',' ', '|',' ','|',' ','|',' '},
                               {'-','+','-','+','-','+','-','+','-'},
                               {' ','|',' ', '|',' ','|',' ','|',' '},
                               {'-','+','-','+','-','+','-','+','-'},
                               {' ','|',' ', '|',' ','|',' ','|',' '},};


     public static void printBoard(char[][] board){
     for(char[] row : board){
         for (char c : row){
             System.out.print(c);
         }
         System.out.println();
         }
    }


    public static boolean checkWinner3x3(List<Integer>playerPositions2X, List<Integer>playerPositions1O){
        wC.add(topRow3);
        wC.add(midRow3);
        wC.add(bottomrow3);
        wC.add(leftColumn3);
        wC.add(midColumn3);
        wC.add(rightColumn3);
        wC.add(crossOne3);
        wC.add(crossTwo3);
        for (List l : wC){
            if (playerPositions1O.containsAll(l)){
                System.out.println("You Win O");
                return false;
            }else if(playerPositions2X.size()+playerPositions1O.size()==9){
                System.out.println("No WInner");
                return false;
            } else if (playerPositions2X.containsAll(l)) {
                System.out.println("You Win X");
                return false;
            }
        }
        return  true;
    }
    public static boolean checkWinner5x5(List<Integer>playerPositions2X,List<Integer>playerPositions1O) {
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

        for (List l : wC2){
            if (playerPositions1O.containsAll(l)){
                System.out.println("You Win O");
                return false;
            }else if(playerPositions2X.size()+playerPositions1O.size()==25){
                System.out.println("No WInner");
                return false;
            } else if (playerPositions2X.containsAll(l)) {
                System.out.println("You Win X");
                return false;
            }
        }
        return  true;
    }

}
