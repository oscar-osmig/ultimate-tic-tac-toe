package com.osmig.GameTools;

import java.util.ArrayList;
import java.util.List;

public class CheckBoundary {
    private static List<String> quadrant0 = new ArrayList<>(
            List.of(
                    "0a", "0b", "0c", "a0", "b0", "c0", "0A", "0B", "0C",
                              "1a", "1b", "1c", "a1", "b1", "c1", "1A", "1B", "1C",
                              "2a", "2b", "2c", "a2", "b2", "c2", "2A", "2B", "2C"
            )
    );

    private List<String> quadrant1 = new ArrayList<>(

    );

    private List<String> quadrant2 = new ArrayList<>(

    );

    private List<String> quadrant3 = new ArrayList<>(

    );

    private List<String> quadrant4 = new ArrayList<>(

    );

    private List<String> quadrant5 = new ArrayList<>(

    );

    private List<String> quadrant6 = new ArrayList<>(

    );

    private List<String> quadrant7 = new ArrayList<>(

    );

    private List<String> quadrant8 = new ArrayList<>(

    );

    public static boolean withinBoundary(List<String> quadrant, String move){
        if (move.equalsIgnoreCase("a0") || move.equalsIgnoreCase("0a") ){
            if (quadrant.contains("a0") || quadrant.contains("0a")){
                return true;
            }
            return false;
        }
        return false;
    }

}
