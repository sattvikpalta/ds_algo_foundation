package basics.twodarrays;

import java.util.Scanner;

public class SpiralDisplay {

    public static void spiralDisplay(int[][] arr) {
        int row = 0;
        int col = 0;
        int startRow = 0;
        int startCol = 1;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        int dir = 0;
        int counter = 0;
        int totalElements = arr.length * arr[0].length;

        while (counter < totalElements) {
            System.out.println(arr[row][col]);
            counter++;

            if (dir == 0) {
                row++;

                if (row == endRow) {
                    dir = 1;
                    endRow--;
                }
            } else if (dir == 1) {
                col++;

                if (col == endCol) {
                    dir = 2;
                    endCol--;
                }
            } else if (dir == 2) {
                row--;

                if (row == startRow) {
                    dir = 3;
                    startRow++;
                }
            } else if (dir == 3) {
                col--;

                if (col == startCol) {
                    dir = 0;
                    startCol++;
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

        spiralDisplay(arr);
    }

}
