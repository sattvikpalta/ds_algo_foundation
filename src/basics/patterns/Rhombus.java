package basics.patterns;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int outerSpaces = numRows / 2;
        int innerSpaces = -1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= outerSpaces; col++) {
                System.out.print("\t");
            }

            System.out.print("*\t");
            for (int col = 1; col <= innerSpaces; col++) {
                System.out.print("\t");
            }

            if (!(row == 1 || row == numRows)) {
                System.out.print("*\t");
            }

            System.out.println();

            if (row >= numRows / 2 + 1) {
                outerSpaces++;
                innerSpaces -= 2;
            } else {
                outerSpaces--;
                innerSpaces += 2;
            }
        }
    }
}
