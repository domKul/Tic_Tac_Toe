package TicTacToe_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public  class Board {
    static ArrayList<Integer> playerPositionsX = new ArrayList<>();
    static ArrayList<Integer> playerPositionsO = new ArrayList<>();


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

    public static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List bottomrow = Arrays.asList(7,8,9);
        List leftColumn = Arrays.asList(1,4,7);
        List midColumn = Arrays.asList(2,5,8);
        List rightColumn = Arrays.asList(3,6,9);
        List crossOne = Arrays.asList(1,5,9);
        List crossTwo = Arrays.asList(3,5,7);

        List<List>wC = new ArrayList<List>();
        wC.add(topRow);
        wC.add(midRow);
        wC.add(bottomrow);
        wC.add(leftColumn);
        wC.add(midColumn);
        wC.add(rightColumn);
        wC.add(crossOne);
        wC.add(crossTwo);
        for (List l : wC){
            boolean posistionCheck =board[0][0]==' ';
            if (playerPositionsX.containsAll(l)){
                return " YOU WIN O";
            }else if(playerPositionsO.size()+playerPositionsX.size()==9){
                return "No WInner";
            } else if (playerPositionsO.containsAll(l)) {
                return "YOU WIN X";
            } else if (!posistionCheck) {
            }
        }
        return "";
    }




}
