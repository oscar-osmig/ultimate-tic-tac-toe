package com.osmig.game_board;

import java.util.ArrayList;
import java.util.List;

public class Quadrant {
    private List<String> quadrant = new ArrayList<>();

    public Quadrant(List<String> quadrant) {
        this.quadrant = quadrant;
    }

    public static void checkWin(){

    }




    public List<String> getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(List<String> quadrant) {
        this.quadrant = quadrant;
    }
}
