package basics.patterns;

import java.util.Scanner;

public class NumTriangle {
    // Program to print a right triangle of numbers

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Variable val to store number values
        int val = 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(val + " ");
                val++;
            }

            System.out.println();
        }
    }

}
