package bas.twodarrays;

import java.util.Scanner;

public class WaveDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] matrix = new int[r][c];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        scn.close();

        for (int col = 0; col < matrix[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    System.out.println(matrix[row][col]);
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    System.out.println(matrix[row][col]);
                }
            }
        }
    }

}
