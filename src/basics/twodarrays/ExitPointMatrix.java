package basics.twodarrays;

import java.util.Scanner;

public class ExitPointMatrix {
    public static void exitPoint(int[][] arr) {
        int row = 0;
        int col = 0;
        int dir = 0;

        while (true) {
            if (row == arr.length || col == arr[0].length) {
                if (row == arr.length) {
                    System.out.println(row - 1);
                    System.out.println(col);
                    break;
                } else {
                    System.out.println(row);
                    System.out.println(col - 1);
                    break;
                }
            }

            if (arr[row][col] != 0) {
                dir++;
                if (dir == 4)
                    dir = 0;
            }

            if (dir == 0)
                col++;
            else if (dir == 1)
                row++;
            else if (dir == 2)
                col--;
            else if (dir == 3)
                row--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                arr[row][col] = scn.nextInt();

        scn.close();

        exitPoint(arr);
    }

}
