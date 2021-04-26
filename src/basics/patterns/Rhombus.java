package basics.patterns;

import java.util.Scanner;

public class Rhombus {
    // Program to print a rhombus

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 5)
        int numRows = scn.nextInt();
        scn.close();

        int outSpace = numRows / 2; // Outer spaces = 5 / 2 = 2
        int inSpace = -1; // Inner spaces = -1

        for (int row = 1; row <= numRows; row++) {
            // Loop to print outer spaces
            for (int col = 1; col <= outSpace; col++) {
                System.out.print("  ");
            }

            // Print a single '*' after outer spaces
            System.out.print("* ");

            // Loop to print inner spaces
            for (int col = 1; col <= inSpace; col++) {
                System.out.print("  ");
            }

            if (row != 1 && row != numRows) {
                System.out.print("* ");
            }

            if (row <= numRows / 2) {
                outSpace--;
                inSpace += 2;
            } else {
                outSpace++;
                inSpace -= 2;
            }

            System.out.println();
        }
    }
}
