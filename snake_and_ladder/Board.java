package com.software_design.snake_and_ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    public Board(int boardSize, int numOfSnakes, int numOfLadders) {
        initializeBoard(boardSize);
        addSnakesAndLaddersToBoard(numOfSnakes, numOfLadders);
    }

    public void initializeBoard(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void addSnakesAndLaddersToBoard(int numOfSnakes, int numOfLadders) {

        while(numOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(0, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(0, cells.length * cells.length - 1);

            if(snakeHead <= snakeTail) {
                continue;
            }

            Jump jump = new Jump(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.jump = jump;

            numOfSnakes--;
        }

        while(numOfLadders > 0) {

            int ladderHead = ThreadLocalRandom.current().nextInt(0, cells.length * cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(0, cells.length * cells.length - 1);

            if(ladderHead >= ladderTail) {
                continue;
            }

            Jump jump = new Jump(ladderHead, ladderTail);
            Cell cell = getCell(ladderHead);
            cell.jump = jump;

            numOfLadders--;
        }
    }

    public Cell getCell(int snakeHead) {
        int row = snakeHead / cells.length;
        int col = snakeHead % cells.length;

        return cells[row][col];
    }

}
