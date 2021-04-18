package rec.reclist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        System.out.println(getMazePaths(1, 1, n, m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        if (sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        ArrayList<String> pathsH = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> pathsV = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : pathsH) {
            paths.add("h" + path);
        }

        for (String path : pathsV) {
            paths.add("v" + path);
        }

        return paths;
    }
}
