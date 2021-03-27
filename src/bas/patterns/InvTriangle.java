package bas.patterns;

import java.util.Scanner;

public class InvTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        for (int row = 1; row <= numRows; row++) {
            for (int col = row; col <= numRows; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
