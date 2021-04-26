package basics.patterns;

import java.util.Scanner;

public class Arrow {
    // Program to print an arrow pattern of stars
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int csp = numRows / 2;
        int cst = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                if (row == numRows / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            if (row <= numRows / 2) {
                cst++;
            } else {
                cst--;
            }

            System.out.println();
        }
    }

}
