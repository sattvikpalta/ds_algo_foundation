package bas.twodarrays;

import java.util.Scanner;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        int x = scn.nextInt();
        scn.close();

        // Linear Search
        /*
         * for (int row = 0; row < matrix.length; row++) { for (int col = 0; col <
         * matrix[row].length; col++) { if (matrix[row][col] == x) {
         * System.out.println(row); System.out.println(col); return; } } }
         * 
         * System.out.println("Not Found");
         */

        // Binary Search
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == x) {
                System.out.println(row);
                System.out.println(col);
                return;
            } else if (x < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Not Found");
    }

}
