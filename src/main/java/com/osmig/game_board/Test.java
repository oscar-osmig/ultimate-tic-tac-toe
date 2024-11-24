package com.osmig.game_board;

import java.util.Scanner;

import static com.osmig.GameTools.CheckNextMove.makeMove;
import static com.osmig.GameTools.Print.print;
import static com.osmig.game_board.GameBoard.*;


public class Test {

    public static void main(String[] args) {
        initializeGrid();
        initializeQuadrants();
        startGame();
    }

    public static void startGame(){
        askForInitialMove();
        while (moveCounter < 80){
            print("");
            String move = getAnswer(player + " move >> ");
            if (GRIDS.get(currentGrid).contains(move.trim())){
                if (!previousMoves.contains(move.trim())){
                    makeMove(move);
                }else {
                    print("That spot has been taken " + "\nMoves: " + String.valueOf(previousMoves));
                }
            } else if (move.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                print("Please enter the a move from the starting tic tac toe");
                print("current playing grid: " + currentGrid);
            }
        }

    }
    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        return scanner.nextLine();
    }

    public static void askForInitialMove(){
        boolean running = true;
        print("");
        print("");
        System.out.println("Player " + player + " starts at middle tic-tac-toe");
        print("current playing grid: " + currentGrid);
        displayBoard();

        // get initial move
        String move = "";
        while (running){
            move = getAnswer("\n" + player + " move >> ");
            print("");
            if (GRIDS.get(currentGrid).contains(move.trim()) && !previousMoves.contains(move.trim())){
                makeMove(move);
                running = false;
            } else if (move.equalsIgnoreCase("q")) {
                running = false;
            } else {
                System.out.println("Please enter the a move from the starting tic tac toe");
            }

        }

    }

}
