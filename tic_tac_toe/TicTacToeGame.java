package com.software_design.tic_tac_toe;

import com.software_design.tic_tac_toe.model.*;
import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    boolean noWinner = true;
    int size = 0;

    public TicTacToeGame(int size) {
        initializeGame(size);
    }

    public void initializeGame(int size) {
        players = new LinkedList<>();

        PlayingPiece crossPiece = new PlayingPieceX();
        Player player1 = new Player("player1", crossPiece);

        PlayingPiece naughtsPiece = new PlayingPieceO();
        Player player2 = new Player("player2", naughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(size);
        this.size = size;
    }

    public String startGame() {

        while(noWinner) {
            Player player = players.remove();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeSpaces();

            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            gameBoard.displayBoard();

            System.out.println("player name is " + player.getName() + " piece type is " +
                    player.getPlayingPiece().getPieceType());
            System.out.println("enter row and column");

            Scanner scanner = new Scanner(System.in);
            String token = scanner.nextLine();
            String[] tokens = token.split(",");

            int row = Integer.valueOf(tokens[0]);
            int col = Integer.valueOf(tokens[1]);

            boolean success = gameBoard.addPieceToBoard(row, col, player.getPlayingPiece().getPieceType());

            if(!success) {
                System.out.println("wrong piece type selected");
                players.addFirst(player);
                continue;
            }

            players.addLast(player);

            if(isWinningCondition(row, col, player.getPlayingPiece().getPieceType())) {
                gameBoard.displayBoard();
                return player.getName();
            }
        }

        return "tie";
    }

    public boolean isWinningCondition(int row, int col, PieceType pieceType) {

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i = 0; i < size; i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
                break;
            }
        }

        for(int i = 0; i < size; i++) {
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].getPieceType() != pieceType) {
                colMatch = false;
                break;
            }
        }

        for(int i = 0; i < size; i++) {
            if(gameBoard.board[i][i] == null || gameBoard.board[i][i].getPieceType() != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        for(int i = 0; i < size; i++) {
            if(gameBoard.board[i][size - i - 1] == null ||
                    gameBoard.board[i][size - i - 1].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }

}
