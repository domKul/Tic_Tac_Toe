package TicTacToe_game;

import java.util.List;
import java.util.Random;

public class Computer5x5 {

    static char PC = 'O';
    public static boolean computerMove5x5(char[][]board2, List<Integer> playerPositions1O, List<Integer>playerPositions2X,
                                          int pcPoss, Random random){
        while (playerPositions1O.contains(pcPoss) || playerPositions2X.contains(pcPoss)) {
            pcPoss = random.nextInt(25) + 1;
        }
        switch (pcPoss) {
            case 1 -> board2[0][0] = PC;
            case 2 -> board2[0][2] = PC;
            case 3 -> board2[0][4] = PC;
            case 4 -> board2[0][6] = PC;
            case 5 -> board2[0][8] = PC;
            case 6 -> board2[2][0] = PC;
            case 7 -> board2[2][2] = PC;
            case 8 -> board2[2][4] = PC;
            case 9 -> board2[2][6] = PC;
            case 10 -> board2[2][8] = PC;
            case 11 -> board2[4][0] = PC;
            case 12 -> board2[4][2] = PC;
            case 13 -> board2[4][4] = PC;
            case 14 -> board2[4][6] = PC;
            case 15 -> board2[4][8] = PC;
            case 16 -> board2[6][0] = PC;
            case 17 -> board2[6][2] = PC;
            case 18 -> board2[6][4] = PC;
            case 19 -> board2[6][6] = PC;
            case 20 -> board2[6][8] = PC;
            case 21 -> board2[8][0] = PC;
            case 22 -> board2[8][2] = PC;
            case 23 -> board2[8][4] = PC;
            case 24 -> board2[8][6] = PC;
            case 25 -> board2[8][8] = PC;
            default -> {
            }
        }
        if (PC =='O'){
            playerPositions1O.add(pcPoss);
        }


        return true ;
}
}
