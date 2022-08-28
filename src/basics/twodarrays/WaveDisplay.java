package basics.twodarrays;

import java.util.Scanner;

public class WaveDisplay {

    public static void waveDisplay(int[][] arr) {
        int row = 0;
        int col = 0;
        boolean dir = true;

        while (col < arr[0].length) {
            if (dir) {
                System.out.println(arr[row][col]);
                row++;
                if (row == arr.length) {
                    dir = false;
                    col++;
                    row--;
                }
            } else {
                System.out.println(arr[row][col]);
                row--;
                if (row == -1) {
                    dir = true;
                    col++;
                    row++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                arr[row][col] = scn.nextInt();

        scn.close();

        waveDisplay(arr);
    }

}
