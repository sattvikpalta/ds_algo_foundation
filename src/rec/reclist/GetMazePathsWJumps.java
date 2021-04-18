package rec.reclist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWJumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        System.out.println(getMazePathsWJumps(1, 1, n, m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathsWJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // Horizontal moves
        for (int move = 1; move <= dc - sc; move++) {
            ArrayList<String> pathsH = getMazePathsWJumps(sr, sc + move, dr, dc);
            for (String pathH : pathsH) {
                paths.add("h" + move + pathH);
            }
        }

        // Vertical moves
        for (int move = 1; move <= dr - sr; move++) {
            ArrayList<String> pathsV = getMazePathsWJumps(sr + move, sc, dr, dc);
            for (String pathV : pathsV) {
                paths.add("v" + move + pathV);
            }
        }

        // Diagonal moves
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            ArrayList<String> pathsD = getMazePathsWJumps(sr + move, sc + move, dr, dc);
            for (String pathD : pathsD) {
                paths.add("d" + move + pathD);
            }
        }


        return paths;
    }

}
