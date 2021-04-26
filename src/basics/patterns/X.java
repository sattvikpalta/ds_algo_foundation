package basics.patterns;

import java.util.Scanner;

public class X {
    // Print 'X' pattern

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                // Print '*' when row equals column or row + column equals number of rows + 1
                // else print ' '
                if (col == row || row + col == numRows + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}
