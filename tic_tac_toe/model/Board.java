package com.software_design.tic_tac_toe.model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public List<Pair<Integer, Integer>> getFreeSpaces() {
        List<Pair<Integer, Integer>> freeSpaces = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    freeSpaces.add(new Pair<>(i, j));
                }
            }
        }
        return freeSpaces;
    }

    public void displayBoard() {

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "    ");
                } else {
                    System.out.print("     ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean addPieceToBoard(int row, int col, PieceType pieceType) {
        if(board[row][col] != null) {
            return false;
        }

        board[row][col] = new PlayingPiece(pieceType);
        return true;
    }
}
