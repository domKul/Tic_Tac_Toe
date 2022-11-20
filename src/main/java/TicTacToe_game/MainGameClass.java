package TicTacToe_game;



import static TicTacToe_game.Board.board;
import static TicTacToe_game.Player.player;

public class MainGameClass {
    public static void main(String[] args){
        System.out.println("Welcome in Tic Toc Toe");




        while(true){
            Board.printBoard(board);
            boolean rghtmovee = Player.playerMoves(board,player);
            if (!rghtmovee)continue;

            if (player=='X'){
                player='O';
            }else {
                player = 'X';
            }
        }

    }


    }



