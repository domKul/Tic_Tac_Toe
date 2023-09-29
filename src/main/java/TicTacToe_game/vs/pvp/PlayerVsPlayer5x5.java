package TicTacToe_game.vs.pvp;

import TicTacToe_game.exception.WrongMouve;

import java.util.List;

public class PlayerVsPlayer5x5 {


    public static char player5x5 = 'X';
    public static boolean playerMove5x5(char[][] board2, List<Integer> playerPositions2X,
                                     List<Integer> playerPositions1O,int posx)throws WrongMouve {
        if(posx>25||posx<1){
            throw new WrongMouve();
        }else{
            while(playerPositions1O.contains(posx)||playerPositions2X.contains(posx)){
                System.out.println("Position taken");
                return false;
            }
            switch (posx) {
                case 1 -> board2[0][0] = player5x5;
                case 2 -> board2[0][2] = player5x5;
                case 3 -> board2[0][4] = player5x5;
                case 4 -> board2[0][6] = player5x5;
                case 5 -> board2[0][8] = player5x5;
                case 6 -> board2[2][0] = player5x5;
                case 7 -> board2[2][2] = player5x5;
                case 8 -> board2[2][4] = player5x5;
                case 9 -> board2[2][6] = player5x5;
                case 10 -> board2[2][8] = player5x5;
                case 11 -> board2[4][0] = player5x5;
                case 12 -> board2[4][2] = player5x5;
                case 13 -> board2[4][4] = player5x5;
                case 14 -> board2[4][6] = player5x5;
                case 15 -> board2[4][8] = player5x5;
                case 16 -> board2[6][0] = player5x5;
                case 17 -> board2[6][2] = player5x5;
                case 18 -> board2[6][4] = player5x5;
                case 19 -> board2[6][6] = player5x5;
                case 20 -> board2[6][8] = player5x5;
                case 21 -> board2[8][0] = player5x5;
                case 22 -> board2[8][2] = player5x5;
                case 23 -> board2[8][4] = player5x5;
                case 24 -> board2[8][6] = player5x5;
                case 25 -> board2[8][8] = player5x5;
                }
            }

            if (player5x5 =='X'){
                player5x5 ='O';
                playerPositions2X.add(posx);
            }else{
                player5x5 ='X';
                playerPositions1O.add(posx);
            }
            return true;
        }

}
