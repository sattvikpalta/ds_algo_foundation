package bas.pattern;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
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
