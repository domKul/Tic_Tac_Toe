package com.example.tic_tac_toe;

import TicTacToe_game.setup.Board;
import TicTacToe_game.setup.WinnerCheck;
import TicTacToe_game.vs.pvp.PlayerVsPlayer3x3;
import TicTacToe_game.exception.WrongMouve;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class TicTacToeApplicationTests {
    private static int counter =0;
    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Begin of tests of Tic Tac Toe");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are done");
    }

    @BeforeEach
      void before(){
        counter++;
        System.out.println("Test #: " + counter);
    }


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
        boolean rowOwin1 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);
        boolean rowOwin2 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO2);
        boolean rowOwin3ifXWin =WinnerCheck.checkWinner3x3(playerMouvesX2,playerMouvesO4);
        boolean rowOwin4 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO3);

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
        boolean columnWin1 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);
        boolean columnWin2 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO2);
        boolean columnWin3ifXWin =WinnerCheck.checkWinner3x3(playerMouvesX2,playerMouvesO4);
        boolean columnWin4 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO3);
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
        boolean crossWin1 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);
        boolean crossWin2 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO2);
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
        boolean rowXwin1 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);
        boolean rowXwin2 =WinnerCheck.checkWinner3x3(playerMouvesX2,playerMouvesO1);
        boolean rowXwin3ifOWin =WinnerCheck.checkWinner3x3(playerMouvesX4,playerMouvesO2); //<-O WIn
        boolean rowXwin4 =WinnerCheck.checkWinner3x3(playerMouvesX3,playerMouvesO1);

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
        boolean columnWin1 = WinnerCheck.checkWinner3x3(playerMouvesX1, playerMouvesO1);
        boolean columnWin2 = WinnerCheck.checkWinner3x3(playerMouvesX2, playerMouvesO1);
        boolean columnWin3ifOWin = WinnerCheck.checkWinner3x3(playerMouvesX4, playerMouvesO2);
        boolean columnWin4 = WinnerCheck.checkWinner3x3(playerMouvesX3, playerMouvesO1);
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
        boolean crossWin1 =WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);
        boolean crossWin2 =WinnerCheck.checkWinner3x3(playerMouvesX2,playerMouvesO1);
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
        boolean noOneWin= WinnerCheck.checkWinner3x3(playerMouvesX1,playerMouvesO1);

        //Then
        assertFalse(noOneWin);
    }


    @Test
    void checkWinnerPlayerTypeWrongMoveNumber() throws WrongMouve {
        //Given
        char [][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-','+','-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+','-' },
                {' ', '|', ' ', '|', ' '}};
        List<Integer> playerMouvesX1= new ArrayList<>();
        List<Integer> playerMouvesO1= new ArrayList<>();

        //When & Then
        assertThrows(WrongMouve.class,()-> PlayerVsPlayer3x3.playerMove(board,playerMouvesX1,playerMouvesO1,11),
                "Wrong number");
    }




}
