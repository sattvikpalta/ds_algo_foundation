package basics.twodarrays;

import java.util.Scanner;

public class SaddlePoint {
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

        for (int row = 0; row < matrix.length; row++) {
            int leastValIdx = 0;
            for (int col = 1; col < matrix[0].length; col++)
                if (matrix[row][col] < matrix[row][leastValIdx])
                    leastValIdx = col;

            boolean flag = true;
            for (int rowCounter = 0; rowCounter < matrix.length; rowCounter++) {
                if (matrix[rowCounter][leastValIdx] > matrix[row][leastValIdx]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(matrix[row][leastValIdx]);
                return;
            }
        }

        System.out.println("Invalid input");
    }

}
