package basics.twodarrays;

import java.util.Scanner;

public class ShellRotate {
    public static int[] shellToArr(int[][] matrix, int s) {
        int startRow = s - 1;
        int startCol = s - 1;
        int endRow = matrix.length - s;
        int endCol = matrix[0].length - s;
        int len = 2 * (endRow - startRow + endCol - startCol);

        int[] arr = new int[len];
        int idx = 0;

        for (int row = startRow, col = startCol; row <= endRow; row++) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        for (int row = endRow, col = startCol + 1; col <= endCol; col++) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        for (int row = endRow - 1, col = endCol; row >= startRow; row--) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        for (int row = startRow, col = endCol - 1; col >= startCol + 1; col--) {
            arr[idx] = matrix[row][col];
            idx++;
        }

        return arr;
    }

    public static void rotate(int[] arr, int r) {
        r %= arr.length;
        if (r < 0) {
            r += arr.length;
        }

        reverse(arr, 0, arr.length - r - 1);
        reverse(arr, arr.length - r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int leftIdx, int rightIdx) {
        while (leftIdx < rightIdx) {
            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;

            leftIdx++;
            rightIdx--;
        }
    }

    public static void arrToShell(int[][] matrix, int[] arr, int s) {
        int startRow = s - 1;
        int startCol = s - 1;
        int endRow = matrix.length - s;
        int endCol = matrix[0].length - s;
        int idx = 0;

        for (int row = startRow, col = startCol; row <= endRow; row++) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        for (int row = endRow, col = startCol + 1; col <= endCol; col++) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        for (int row = endRow - 1, col = endCol; row >= startRow; row--) {
            matrix[row][col] = arr[idx];
            idx++;
        }

        for (int row = startRow, col = endCol - 1; col >= startCol + 1; col--) {
            matrix[row][col] = arr[idx];
            idx++;
        }
    }

    public static void shellRotate(int[][] matrix, int s, int r) {
        int[] arr = shellToArr(matrix, s);
        rotate(arr, r);
        arrToShell(matrix, arr, s);
    }

    public static void display(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

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

}
