package com.software_design.snake_and_ladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    public void addPlayers() {
        Player player1 = new Player("player1", 0);
        Player player2 = new Player("player2", 0);

        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame() {

        while(winner == null) {

            Player currentPlayer = playerList.removeFirst();
            playerList.addLast(currentPlayer);

            System.out.println("current player is " + currentPlayer.id + " pos is " + currentPlayer.currentPos);

            int jump = dice.rollDice();

            int newPosition = currentPlayer.currentPos + jump;

            newPosition = jumpCheck(newPosition);
            currentPlayer.currentPos = newPosition;


            System.out.println("current player is " + currentPlayer.id + " pos is " + currentPlayer.currentPos);

            if(newPosition >= board.cells.length * board.cells.length - 1) {
                winner = currentPlayer;
            }
        }
        System.out.println("WINNER IS " + winner.id);
    }

    private int jumpCheck(int newPosition) {
        if(newPosition > board.cells.length * board.cells.length - 1) {
            return newPosition;
        }

        Cell cell = board.getCell(newPosition);

        if(cell.jump != null && cell.jump.start == newPosition) {
            String jump = cell.jump.start > cell.jump.end ? "snake" : "ladder";
            System.out.println("jump done by " + jump);
            return cell.jump.end;
        }
        return newPosition;
    }
}
