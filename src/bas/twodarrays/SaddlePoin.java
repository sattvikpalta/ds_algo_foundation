package bas.twodarrays;

import java.util.Scanner;

public class SaddlePoin {
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

        for (int k = 0; k < matrix.length; k++) {
            int smallestColIdx = 0;
            for (int col = 1; col < matrix[k].length; col++) {
                if (matrix[k][col] < matrix[k][smallestColIdx]) {
                    smallestColIdx = col;
                }
            }

            boolean flag = true;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][smallestColIdx] > matrix[k][smallestColIdx]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(matrix[k][smallestColIdx]);
                return;
            }
        }

        System.out.println("Invalid input");
    }

}
