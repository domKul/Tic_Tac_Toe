package TicTacToe_game;


import java.util.List;

public class PlayerVsPlayer {
    static char player= 'X';



    public static boolean playerMove(char[][] board, List<Integer>playerPositions2X,
                                     List<Integer> playerPositions1O,int pos)throws WrongMouve{

        if(pos>9||pos<1){
            throw new WrongMouve();
        }else{
        while(playerPositions1O.contains(pos)||playerPositions2X.contains(pos)){
             System.out.println("Position taken");
             return false;

         }
            switch (pos) {
                case 1 -> board[0][0] = player;
                case 2 -> board[0][2] = player;
                case 3 -> board[0][4] = player;
                case 4 -> board[2][0] = player;
                case 5 -> board[2][2] = player;
                case 6 -> board[2][4] = player;
                case 7 -> board[4][0] = player;
                case 8 -> board[4][2] = player;
                case 9 -> board[4][4] = player;
                default -> {
                }
            }


        if (player =='X'){
            player ='O';
            playerPositions2X.add(pos);
        }else{
            player='X';
            playerPositions1O.add(pos);
        }
        return true;
     }
    }


    }












