package com.software_design.tic_tac_toe;

public class Main {

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame(3);
        System.out.println("winner is : " + ticTacToeGame.startGame());
    }
}
