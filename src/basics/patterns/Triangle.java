package basics.patterns;

import java.util.Scanner;

public class Triangle {
    // Program to print a right angle triangle using stars

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Loop through rows where stars equal to row number
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
