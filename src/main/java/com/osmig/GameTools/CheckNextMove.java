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
            displayBoard();




        }



    }


