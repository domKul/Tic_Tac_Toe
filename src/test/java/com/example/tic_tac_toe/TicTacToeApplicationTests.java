package com.example.tic_tac_toe;

import TicTacToe_game.Board;
import TicTacToe_game.Player;
import TicTacToe_game.TheGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TicTacToeApplicationTests {

    @Test
    void checkWinnerOinRowTest() {
        //Given
        List<Integer>playerMouvesO1 = Arrays.asList(1,2,3); //<-- winning list of winning row1
        List<Integer>playerMouvesO2 = Arrays.asList(4,5,6); //<-- winning list of winning row2
        List<Integer>playerMouvesO3 = Arrays.asList(7,8,9); //<-- winning list of winning row3
        List<Integer>playerMouvesO4 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesX1 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesX2 = Arrays.asList(1,2,3); //<-- winning list of winning row for X
        //When
        boolean rowOwin1 =Board.checkWinner(playerMouvesX1,playerMouvesO1);
        boolean rowOwin2 =Board.checkWinner(playerMouvesX1,playerMouvesO2);
        boolean rowOwin3ifXWin =Board.checkWinner(playerMouvesX2,playerMouvesO4);
        boolean rowOwin4 =Board.checkWinner(playerMouvesX1,playerMouvesO3);

        //Then
        assertFalse(rowOwin1);
        assertFalse(rowOwin2);
        assertFalse(rowOwin3ifXWin); // <- if O lose
        assertFalse(rowOwin4);
    }

    @Test
    void checkWinnerOinColumnTest(){
        //Given
        List<Integer>playerMouvesO1 = Arrays.asList(1,4,7); //<-- winning list of winning column1
        List<Integer>playerMouvesO2 = Arrays.asList(2,5,8); //<-- winning list of winning column2
        List<Integer>playerMouvesO3 = Arrays.asList(3,6,9); //<-- winning list of winning column3
        List<Integer>playerMouvesO4 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesX1 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesX2 = Arrays.asList(1,4,7); //<-- winning list of winning column for X
        //When
        boolean columnWin1 =Board.checkWinner(playerMouvesX1,playerMouvesO1);
        boolean columnWin2 =Board.checkWinner(playerMouvesX1,playerMouvesO2);
        boolean columnWin3ifXWin =Board.checkWinner(playerMouvesX2,playerMouvesO4);
        boolean columnWin4 =Board.checkWinner(playerMouvesX1,playerMouvesO3);
        //Then
        assertFalse(columnWin1);
        assertFalse(columnWin2);
        assertFalse(columnWin3ifXWin); // <- if O lose
        assertFalse(columnWin4);

    }

    @Test
    void checkWinnerOinCrossTest(){
        //Given
        List<Integer>playerMouvesO1 = Arrays.asList(1,5,9); //<-- winning list of winning cross1
        List<Integer>playerMouvesO2 = Arrays.asList(3,5,7); //<-- winning list of winning cross2
        List<Integer>playerMouvesX1 = Arrays.asList(2,3,4);
        //When
        boolean crossWin1 =Board.checkWinner(playerMouvesX1,playerMouvesO1);
        boolean crossWin2 =Board.checkWinner(playerMouvesX1,playerMouvesO2);
        //Then
        assertFalse(crossWin1);
        assertFalse(crossWin2);
    }
    @Test
    void checkWinnerXinRowTest() {
        //Given
        List<Integer>playerMouvesX1 = Arrays.asList(1,2,3); //<-- winning list of winning row1
        List<Integer>playerMouvesX2 = Arrays.asList(4,5,6); //<-- winning list of winning row2
        List<Integer>playerMouvesX3 = Arrays.asList(7,8,9); //<-- winning list of winning row3
        List<Integer>playerMouvesX4 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesO1 = Arrays.asList(4,5,7);
        List<Integer>playerMouvesO2 = Arrays.asList(1,2,3); //<-- winning list of winning row for O
        //When
        boolean rowXwin1 =Board.checkWinner(playerMouvesX1,playerMouvesO1);
        boolean rowXwin2 =Board.checkWinner(playerMouvesX2,playerMouvesO1);
        boolean rowXwin3ifOWin =Board.checkWinner(playerMouvesX4,playerMouvesO2); //<-O WIn
        boolean rowXwin4 =Board.checkWinner(playerMouvesX3,playerMouvesO1);

        //Then
        assertFalse(rowXwin1);
        assertFalse(rowXwin2);
        assertFalse(rowXwin3ifOWin); // <- if X lose
        assertFalse(rowXwin4);
    }
    @Test
    void checkWinnerXinColumnTest() {
        //Given
        List<Integer> playerMouvesX1 = Arrays.asList(1, 4, 7); //<-- winning list of winning column1
        List<Integer> playerMouvesX2 = Arrays.asList(2, 5, 8); //<-- winning list of winning column2
        List<Integer> playerMouvesX3 = Arrays.asList(3, 6, 9); //<-- winning list of winning column3
        List<Integer> playerMouvesX4 = Arrays.asList(4, 5, 7);
        List<Integer> playerMouvesO1 = Arrays.asList(4, 5, 7);
        List<Integer> playerMouvesO2 = Arrays.asList(1, 4, 7); //<-- winning list of winning column for X
        //When
        boolean columnWin1 = Board.checkWinner(playerMouvesX1, playerMouvesO1);
        boolean columnWin2 = Board.checkWinner(playerMouvesX2, playerMouvesO1);
        boolean columnWin3ifOWin = Board.checkWinner(playerMouvesX4, playerMouvesO2);
        boolean columnWin4 = Board.checkWinner(playerMouvesX3, playerMouvesO1);
        //Then
        assertFalse(columnWin1);
        assertFalse(columnWin2);
        assertFalse(columnWin3ifOWin); // <- if X lose
        assertFalse(columnWin4);
    }

    @Test
    void checkWinnerXinCrossTest(){
        //Given
        List<Integer>playerMouvesX1 = Arrays.asList(1,5,9); //<-- winning list of winning cross1
        List<Integer>playerMouvesX2 = Arrays.asList(3,5,7); //<-- winning list of winning cross2
        List<Integer>playerMouvesO1 = Arrays.asList(2,3,4);
        //When
        boolean crossWin1 =Board.checkWinner(playerMouvesX1,playerMouvesO1);
        boolean crossWin2 =Board.checkWinner(playerMouvesX2,playerMouvesO1);
        //Then
        assertFalse(crossWin1);
        assertFalse(crossWin2);
    }

    @Test
    void checkWinnerIfNoOneWin(){
        //Given
        List<Integer>playerMouvesX1= Arrays.asList(1,2,5,6,9);
        List<Integer>playerMouvesO1= Arrays.asList(3,4,7,8);
        //When
        boolean noOneWin= Board.checkWinner(playerMouvesX1,playerMouvesO1);

        //Then
        assertFalse(noOneWin);
    }

    @Test
    void checkWinnerPlayerTypeWrongMoveNumber(){
        //Given
        List<Integer> playerMouvesX1= Arrays.asList(3,22);
        List<Integer> playerMouvesO1= Arrays.asList(2,7);
        //When
         TheGame.gameRunning(playerMouvesX1,playerMouvesO1);


        //Then

    }


}
