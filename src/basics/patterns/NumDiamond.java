package basics.patterns;

import java.util.Scanner;

public class NumDiamond {
    // Program to print a diamond of numbers

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int csp = numRows / 2;
        int cst = 1;

        int val = 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            int cval = val;
            for (int col = 1; col <= cst; col++) {
                System.out.print(cval + " ");

                if (col <= cst / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (row <= numRows / 2) {
                csp--;
                cst += 2;
                val++;
            } else {
                csp++;
                cst -= 2;
                val--;
            }

            System.out.println();
        }
    }

}
