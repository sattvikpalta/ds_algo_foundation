package rec.recwayup;

import java.util.Scanner;

public class PrintMazePathsWJumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        // Horizontal moves
        for (int move = 1; move <= dc - sc; move++) {
            printMazePaths(sr, sc + move, dr, dc, psf + 'h' + move);
        }

        // Vertical moves
        for (int move = 1; move <= dr - sr; move++) {
            printMazePaths(sr + move, sc, dr, dc, psf + 'v' + move);
        }

        // Diagonal moves
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            printMazePaths(sr + move, sc + move, dr, dc, psf + 'd' + move);
        }
    }
}
