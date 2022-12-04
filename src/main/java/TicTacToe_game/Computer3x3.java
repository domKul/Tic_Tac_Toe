package TicTacToe_game;

import java.util.List;
import java.util.Random;


public class Computer3x3 {

    static char PC = 'O';

    public static boolean computerMove(char[][]board, List<Integer> playerPositions1O,List<Integer>playerPositions2X,
                                       int pcPos, Random random){
        while (playerPositions1O.contains(pcPos) || playerPositions2X.contains(pcPos)) {
            pcPos = random.nextInt(9) + 1;
        }
        switch (pcPos) {
            case 1 -> board[0][0] = PC;
            case 2 -> board[0][2] = PC;
            case 3 -> board[0][4] = PC;
            case 4 -> board[2][0] = PC;
            case 5 -> board[2][2] = PC;
            case 6 -> board[2][4] = PC;
            case 7 -> board[4][0] = PC;
            case 8 -> board[4][2] = PC;
            case 9 -> board[4][4] = PC;
            default -> {
            }
        }
        if (PC =='O'){
            playerPositions1O.add(pcPos);
        }


        return true ;

    }


}
