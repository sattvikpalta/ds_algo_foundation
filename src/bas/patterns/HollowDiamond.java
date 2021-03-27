package bas.patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        int csp = 1;
        int cst = numRows / 2 + 1;

        for (int row = 1; row <= numRows; row++) {
            
            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            if (row <= numRows / 2) {
                csp+=2;
                cst--;
            } else {
                csp-=2;
                cst++;
            }

            System.out.println();
        }
    }

}
