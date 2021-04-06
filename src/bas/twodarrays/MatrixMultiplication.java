package bas.twodarrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] one = new int[r1][c1];
        for (int row = 0; row < one.length; row++) {
            for (int col = 0; col < one[row].length; col++) {
                one[row][col] = scn.nextInt();
            }
        }

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] two = new int[r2][c2];
        for (int row = 0; row < two.length; row++) {
            for (int col = 0; col < two[row].length; col++) {
                two[row][col] = scn.nextInt();
            }
        }

        scn.close();

        if (c1 != r2) {
            System.out.println("Invalid input");
        } else {
            int[][] prod = new int[one.length][two[0].length];

            for (int row = 0; row < prod.length; row++) {
                for (int col = 0; col < prod[row].length; col++) {
                    for (int k = 0; k < one[row].length; k++) {
                        prod[row][col] += one[row][k] * two[k][col];
                    }
                }
            }

            for (int row = 0; row < prod.length; row++) {
                for (int col = 0; col < prod[row].length; col++) {
                    System.out.print(prod[row][col] + " ");
                }

                System.out.println();
            }
        }
    }

}
