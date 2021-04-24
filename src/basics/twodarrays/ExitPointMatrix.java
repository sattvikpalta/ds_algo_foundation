package basics.twodarrays;

import java.util.Scanner;

public class ExitPointMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        scn.close();

        int row = 0;
        int col = 0;

        int dir = 0; // 0 - east, 1 - south, 2 - west, 3 - north

        while (true) {
            dir = (dir + matrix[row][col]) % 4;
            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else if (dir == 3) {
                row--;
            }

            if (row == -1) {
                row++;
                break;
            } else if (col == -1) {
                col++;
                break;
            } else if (row == matrix.length) {
                row--;
                break;
            } else if (col == matrix[0].length) {
                col--;
                break;
            }
        }

        System.out.println(row);
        System.out.println(col);
    }

}
