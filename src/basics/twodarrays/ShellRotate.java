package basics.twodarrays;

import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] matrix = new int[n][m];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        scn.close();

        shellRotate(matrix, s, r);
        display(matrix);

    }

    public static void shellRotate(int[][] matrix, int s, int r) {
        int[] arr = shellToArr(matrix, s);
        rotateArr(arr, r);
        ArrToShell(matrix, s, arr);
    }

    public static int[] shellToArr(int[][] matrix, int s) {
        int sor = s - 1;
        int soc = s - 1;
        int eor = matrix.length - s;
        int eoc = matrix[0].length - s;

        /*
         * Total number of elements => Left wall + Right wall + Bottom wall + Top wall -
         * 4 (to exclude doubling of 4 corners) 2 * (left wall) + 2 * (right wall) - 4 2
         * * (eor - sor + 1) + 2 * (eoc - soc + 1) - 4 2 * eor + 2 * sor + 2 + 2 * eoc +
         * 2 * soc + 2 - 4 2 * (eor + sor + eoc + soc)
         */

        int tne = 2 * (eor - sor + eoc - soc);

        int[] arr = new int[tne];
        int idx = 0;

        // Left wall
        for (int row = sor, col = soc; row <= eor; row++) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        // Bottom wall
        for (int row = eor, col = soc + 1; col <= eoc; col++) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        // Right wall
        for (int row = eor - 1, col = eoc; row >= sor; row--) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        // Top wall
        for (int row = sor, col = eoc - 1; col >= soc + 1; col--) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        return arr;
    }

    public static void ArrToShell(int[][] matrix, int s, int[] arr) {
        int sor = s - 1;
        int soc = s - 1;
        int eor = matrix.length - s;
        int eoc = matrix[0].length - s;

        int idx = 0;

        // Left wall
        for (int row = sor, col = soc; row <= eor; row++) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        // Bottom wall
        for (int row = eor, col = soc + 1; col <= eoc; col++) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        // Right wall
        for (int row = eor - 1, col = eoc; row >= sor; row--) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        // Top wall
        for (int row = sor, col = eoc - 1; col >= soc + 1; col--) {
            matrix[row][col] = arr[idx];
            idx++;
        }
    }

    public static void rotateArr(int[] arr, int r) {
        r %= arr.length;
        if (r < 0) {
            r += arr.length;
        }

        reverseArr(arr, 0, arr.length - r - 1);
        reverseArr(arr, arr.length - r, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }

    public static void reverseArr(int[] arr, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;

            startIdx++;
            endIdx--;
        }
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
