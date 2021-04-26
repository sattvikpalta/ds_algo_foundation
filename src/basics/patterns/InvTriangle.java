package basics.patterns;

import java.util.Scanner;

public class InvTriangle {
    // Program to print an inverted right triangle using stars

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Loop through rows where stars decrease as rows increase
        for (int row = 1; row <= numRows; row++) {
            for (int col = row; col <= numRows; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
