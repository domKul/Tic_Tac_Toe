package TicTacToe_game;


import java.util.List;
import java.util.Scanner;

import static TicTacToe_game.Board.*;

public class Player{
    static char player= 'X';

    public static boolean playerMove(){
        Scanner scan = new Scanner(System.in);
        System.out.println("yours tour " + player);
        System.out.println("What is your move 1-9");
         int pos = scan.nextInt();
         while(playerPositionsX.contains(pos)||playerPositionsO.contains(pos)){
             System.out.println("Wrong mouve");
             pos = scan.nextInt();
         }
        System.out.println(pos);
        if(pos>9){
            System.out.println("Wrong number, try again");
            return false;
        }

        switch(pos){
            case 1:
                board[0][0] = player;
                break;
            case 2:
                board[0][2] = player;
                break;
            case 3:
                board[0][4] = player;
                break;
            case 4:
                board[2][0] = player;
                break;
            case 5:
                board[2][2] = player;
                break;
            case 6:
                board[2][4] = player;
                break;
            case 7:
                board[4][0] = player;
                break;
            case 8:
                board[4][2] = player;
                break;
            case 9:
                board[4][4] = player;
                break;


            default:
                break;
        }


        if (player =='X'){
            player ='O';
            playerPositionsO.add(pos);
        }else{
            player='X';
            playerPositionsX.add(pos);
        }
        return true;
    }

    public static void poscheck(){



    }
    }












