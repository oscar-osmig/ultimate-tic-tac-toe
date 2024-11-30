package com.osmig.GameTools;

import static com.osmig.game_board.GameBoard.*;
import static com.osmig.GameTools.Print.print;


public class CheckNextMove {

        public static void changePlayer(){
            player = player.equals(" x ") ? " o " : " x ";
        }

        public static void setNextGrid(String move){
                //GRIDS.put(0, new ArrayList<>(Arrays.asList("a0", "b0", "c0", "a1", "b1", "c1", "a2", "b2", "c2")));
            switch (move) {
                case "a0", "a3", "a6", "d0", "d3", "d6", "g0", "g3", "g6" -> currentGrid = 0;
                case "b0", "b3", "b6", "e0", "e3", "e6", "h0", "h3", "h6" -> currentGrid = 1;
                case "c0", "c3", "c6", "f0", "f3", "f6", "i0", "i3", "i6" -> currentGrid = 2;
                case "a1", "a4", "a7", "d1", "d4", "d7", "g1", "g4", "g7" -> currentGrid = 3;
                case "b1", "b4", "b7", "e1", "e4", "e7", "h1", "h4", "h7" -> currentGrid = 4;
                case "c1", "c4", "c7", "f1", "f4", "f7", "i1", "i4", "i7" -> currentGrid = 5;
                case "a2", "a5", "a8", "d2", "d5", "d8", "g2", "g5", "g8" -> currentGrid = 6;
                case "b2", "b5", "b8", "e2", "e5", "e8", "h2", "h5", "h8" -> currentGrid = 7;
                case "c2", "c5", "c8", "f2", "f5", "f8", "i2", "i5", "i8" -> currentGrid = 8;
            }

        }

        public static void makeMove(String move) {
            previousMoves.add(move);
            setNextGrid(move);
            print("current playing grid: " + currentGrid);
            print("Previous moves: " + String.valueOf(previousMoves));
            assignSpot(move);
            displayBoard();

        }

    private static void assignSpot(String move) {
            // grid 0
        switch (move) {
            case "a0", "0a" -> {
                board[1][1] = player;
                changePlayer();
            }
            case "a1", "1a" -> {
                board[3][1] = player;
                changePlayer();
            }
            case "a2", "2a" -> {
                board[5][1] = player;
                changePlayer();
            }
            case "b0", "0b" -> {
                board[1][3] = player;
                changePlayer();
            }
            case "b1", "1b" -> {
                board[3][3] = player;
                changePlayer();
            }
            case "b2", "2b" -> {
                board[5][3] = player;
                changePlayer();
            }
            case "c0", "0c" -> {
                board[1][5] = player;
                changePlayer();
            }
            case "c1", "1c" -> {
                board[3][5] = player;
                changePlayer();
            }
            case "c2", "2c" -> {
                board[5][5] = player;
                changePlayer();
            }

            // second tic-tac-toe - grid 1
            case "d0", "0d" -> {
                board[1][7] =  "  " + player;
                changePlayer();
            }case "d1", "1d" -> {
                board[3][7] =  "  " + player;
                changePlayer();
            }case "d2", "2d" -> {
                board[5][7] =  "  " + player;
                changePlayer();
            }case "e0", "0e" -> {
                board[1][9] = player;
                changePlayer();
            }case "e1", "1e" -> {
                board[3][9] = player;
                changePlayer();
            }case "e2", "2e" -> {
                board[5][9] = player;
                changePlayer();
            }case "f0", "0f" -> {
                board[1][11] = player;
                changePlayer();
            }case "f1", "1f" -> {
                board[3][11] = player;
                changePlayer();
            }case "f2", "2f" -> {
                board[5][11] = player;
                changePlayer();
            }

            // grid 2
            case "g0", "0g" -> {
                board[1][13] = "  " + player;
                changePlayer();
            }case "g1", "1g" -> {
                board[3][13] = "  " + player;
                changePlayer();
            }case "g2", "2g" -> {
                board[5][13] = "  " + player;
                changePlayer();
            }case "h0", "0h" -> {
                board[1][15] = player;
                changePlayer();
            }case "h1", "1h" -> {
                board[3][15] = player;
                changePlayer();
            }case "h2", "2h" -> {
                board[5][15] = player;
                changePlayer();
            }case "i0", "0i" -> {
                board[1][17] = player;
                changePlayer();
            }case "i1", "1i" -> {
                board[3][17] = player;
                changePlayer();
            }case "i2", "2i" -> {
                board[5][17] = player;
                changePlayer();
            }

            // grid 3
            case "a3", "3a" -> {
                board[7][1] = player;
                changePlayer();
            }case "a4", "4a" -> {
                board[9][1] = player;
                changePlayer();
            }case "a5", "5a" -> {
                board[11][1] = player;
                changePlayer();
            }case "b3", "3b" -> {
                board[7][3] = player;
                changePlayer();
            }case "b4", "4b" -> {
                board[9][3] = player;
                changePlayer();
            }case "b5", "5b" -> {
                board[11][3] = player;
                changePlayer();
            }case "c3", "3c" -> {
                board[7][5] = player;
                changePlayer();
            }case "c4", "4c" -> {
                board[9][5] = player;
                changePlayer();
            }case "c5", "5c" -> {
                board[11][5] = player;
                changePlayer();
            }



            // center tic-tac-toe - grid 4
            case "d3", "3d" -> {
                board[7][7] = "  " +player; // for the rest, close to line in big tic-tac-toe do like this
                changePlayer();
            }case "d4", "4d" -> {
                board[9][7] = "  " +player;
                changePlayer();
            }case "d5", "5d" -> {
                board[11][7] = "  " +player;
                changePlayer();
            }case "e3", "3e" -> {
                board[7][9] = player;
                changePlayer();
            }case "e4", "4e" -> {
                board[9][9] = player;
                changePlayer();
            }case "e5", "5e" -> {
                board[11][9] = player;
                changePlayer();
            }case "f3", "3f" -> {
                board[7][11] = player;
                changePlayer();
            }case "f4", "4f" -> {
                board[9][11] = player;
                changePlayer();
            }case "f5", "5f" -> {
                board[11][11] = player;
                changePlayer();
            }

            // grid 5
            case "g3", "3g" -> {
                board[7][13] = "  " +player; // for the rest, close to line in big tic-tac-toe do like this
                changePlayer();
            }case "g4", "4g" -> {
                board[9][13] = "  " +player;
                changePlayer();
            }case "g5", "5g" -> {
                board[11][13] = "  " +player;
                changePlayer();
            }case "h3", "3h" -> {
                board[7][15] = player;
                changePlayer();
            }case "h4", "4h" -> {
                board[9][15] = player;
                changePlayer();
            }case "h5", "5h" -> {
                board[11][15] = player;
                changePlayer();
            }case "i3", "3i" -> {
                board[7][17] = player;
                changePlayer();
            }case "i4", "4i" -> {
                board[9][17] = player;
                changePlayer();
            }case "i5", "5i" -> {
                board[11][17] = player;
                changePlayer();
            }

            // TODO: do cases grid 6
            // grid 6

            // TODO: do cases grid 7
            // grid 7

            // TODO: do cases grid 8
            // grid 8

        }

    }


}


