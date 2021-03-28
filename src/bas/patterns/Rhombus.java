package bas.patterns;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        int outSpace = numRows / 2;
        int inSpace = -1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= outSpace; col++) {
                System.out.print("  ");
            }

            System.out.print("* ");

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
