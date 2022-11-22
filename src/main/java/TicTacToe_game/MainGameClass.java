package TicTacToe_game;



import static TicTacToe_game.Player.player;
import static TicTacToe_game.Board.board;


public class MainGameClass {
    public static void main(String[] args){
        System.out.println("Welcome in Tic Toc Toe");
        while(true){
            try{
                Board.printBoard(board);
            boolean moves = Player.playerMoves(board, player);
            if (moves){
            if (player=='X'){player='O';}
                else { player = 'X';}
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("YOU CAN ONLY CHOSSE NUMBERS BETWEEN 0 AND 2 TO PLAY");

            }
        }

        }



    }






