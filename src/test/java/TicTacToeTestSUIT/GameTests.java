package TicTacToeTestSUIT;


import static TicTacToe_game.Board.*;



import TicTacToe_game.TheGame;
import org.junit.jupiter.api.Test;

public class GameTests {


    @Test
    public void checkWinnerOinRow(){
        //Given
         char [][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-','+','-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+','-' },
                {' ', '|', ' ', '|', ' '}};

        TheGame.gameRunning();

    }

}
