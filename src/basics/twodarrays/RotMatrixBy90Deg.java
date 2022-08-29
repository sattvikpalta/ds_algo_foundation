package basics.twodarrays;

import java.util.Scanner;

public class RotMatrixBy90Deg {
    public static void display(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++)
                System.out.print(arr[row][col] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = scn.nextInt();

        scn.close();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix[0].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix.length - 1 - col];
                matrix[row][matrix.length - 1 - col] = temp;
            }
        }

        display(matrix);
    }

}
