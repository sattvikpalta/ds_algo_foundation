package bas.twodarrays;

import java.util.Scanner;

public class SpiralDisplay {
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

        int sor = 0; // sor[start of row]
        int soc = 0; // soc[start of column]
        int eor = matrix.length - 1; // eor[end of row]
        int eoc = matrix[0].length - 1; // eoc[end of column]
        int tne = n * m; // tne[total number of elements]
        int count = 0;

        while (count < tne) {
            for (int row = sor, col = soc; row <= eor && count < tne; row++) {
                System.out.println(matrix[row][col]);
                count++;
            }

            soc++;

            for (int row = eor, col = soc; col <= eoc && count < tne; col++) {
                System.out.println(matrix[row][col]);
                count++;
            }

            eor--;

            for (int row = eor, col = eoc; row >= sor && count < tne; row--) {
                System.out.println(matrix[row][col]);
                count++;
            }

            eoc--;

            for (int row = sor, col = eoc; col >= soc && count < tne; col--) {
                System.out.println(matrix[row][col]);
                count++;
            }

            sor++;

        }

    }

}
