package basics.twodarrays;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = scn.nextInt();

        scn.close();

        for (int row = 0; row < matrix.length; row++) {
            for (int rowCounter = 0, col = row; col < matrix[0].length; col++, rowCounter++)
                System.out.println(matrix[rowCounter][col]);

        }
    }

}
