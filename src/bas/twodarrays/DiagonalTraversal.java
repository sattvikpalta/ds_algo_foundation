package bas.twodarrays;

import java.util.Scanner;

public class DiagonalTravers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        scn.close();

        int i = 0;

        while (i < matrix.length) {
            for (int row = 0, col = i; row < matrix.length - i; row++, col++) {
                System.out.println(matrix[row][col]);
            }

            i++;
        }
    }

}
