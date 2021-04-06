package bas.patterns;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int csp = 0;
        int cst = numRows;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= cst; col++) {
                if (row > 1 && row <= numRows / 2 && col > 1 && col < cst) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            if (row <= numRows / 2) {
                csp++;
                cst -= 2;
            } else {
                csp--;
                cst += 2;
            }

            System.out.println();
        }
    }

}
