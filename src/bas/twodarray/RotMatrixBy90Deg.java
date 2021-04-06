package bas.twodarrays;

import java.util.Scanner;

public class RotMatrixBy90Deg {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        scn.close();

        // Transpose of matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix[row].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse by columns
        for (int row = 0; row < matrix.length; row++) {
            int left = 0;
            int right = matrix[0].length - 1;

            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
                right--;
            }
            
            /*
             * for (int col = 0; col < matrix[row].length / 2; col++) { int i =
             * matrix[row].length - 1; int temp = matrix[row][col]; matrix[row][col] =
             * matrix[row][i - col]; matrix[row][i - col] = temp; i--; }
             */
        }

        display(matrix);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

}
