package basics.patterns;

import java.util.Scanner;

public class ForwardSlash {
    // Program to print forward slash pattern

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                // Print '*' when row + col equals number of rows + 1 else print ' '
                if (col + row == numRows + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}
