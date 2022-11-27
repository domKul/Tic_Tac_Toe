package TicTacToe_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public  class Board {
    static ArrayList<Integer> playerPositions1 = new ArrayList<>();
    static ArrayList<Integer> playerPositions2 = new ArrayList<>();

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

    public static boolean checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List bottomrow = Arrays.asList(7,8,9);
        List leftColumn = Arrays.asList(1,4,7);
        List midColumn = Arrays.asList(2,5,8);
        List rightColumn = Arrays.asList(3,6,9);
        List crossOne = Arrays.asList(1,5,9);
        List crossTwo = Arrays.asList(3,5,7);

        List<List>wC = new ArrayList<>();
        wC.add(topRow);
        wC.add(midRow);
        wC.add(bottomrow);
        wC.add(leftColumn);
        wC.add(midColumn);
        wC.add(rightColumn);
        wC.add(crossOne);
        wC.add(crossTwo);
        for (List l : wC){
            if (playerPositions1.containsAll(l)){
                System.out.println("You Win O");
                return false;
            }else if(playerPositions2.size()+playerPositions1.size()==9){
                System.out.println("No WInner");
                return false;
            } else if (playerPositions2.containsAll(l)) {
                System.out.println("You Win X");
                return false;
            }
        }
        return  true;
    }




}
