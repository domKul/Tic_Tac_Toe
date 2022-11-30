package TicTacToe_game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public  class Board {
    static ArrayList<Integer> playerPositions1O = new ArrayList<>();
     static ArrayList<Integer> playerPositions2X = new ArrayList<>();
      static List topRow = Arrays.asList(1,2,3);
    static List midRow = Arrays.asList(4,5,6);
    static List bottomrow = Arrays.asList(7,8,9);
    static List leftColumn = Arrays.asList(1,4,7);
    static List midColumn = Arrays.asList(2,5,8);
    static List rightColumn = Arrays.asList(3,6,9);
    static List crossOne = Arrays.asList(1,5,9);
    static List crossTwo = Arrays.asList(3,5,7);


    static char [][] board = {{' ', '|', ' ', '|', ' '},
                               {'-', '+', '-','+','-'},
                               {' ', '|', ' ', '|', ' '},
                               {'-', '+', '-', '+','-' },
                               {' ', '|', ' ', '|', ' '}};


     public static void printBoard(char[][] board){
     for(char[] row : board){
         for (char c : row){
             System.out.print(c);
         }
         System.out.println();
         }
    }


    static List<List>wC = new ArrayList<>();




    public static boolean checkWinner( List<Integer>playerPositions2X,List<Integer>playerPositions1O){
        wC.add(topRow);
        wC.add(midRow);
        wC.add(bottomrow);
        wC.add(leftColumn);
        wC.add(midColumn);
        wC.add(rightColumn);
        wC.add(crossOne);
        wC.add(crossTwo);
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




}
