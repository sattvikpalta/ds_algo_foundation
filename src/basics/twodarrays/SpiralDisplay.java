package basics.twodarrays;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] arr = new int[rows][cols];
        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                arr[row][col] = scn.nextInt();
            
        scn.close();
        spiralDisplay(arr);
    }

}
