package basics.patterns;

import java.util.Scanner;

public class HollowDiamond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int spaceCount = 1;
        int starCount = numRows + 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= starCount / 2; col++) {
                System.out.print("* ");
            }

            for (int col = 1; col <= spaceCount; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= starCount / 2; col++) {
                System.out.print("* ");
            }

            System.out.println();

            if (row >= numRows / 2 + 1) {
                spaceCount -= 2;
                starCount += 2;
            } else {
                spaceCount += 2;
                starCount -= 2;
            }
        }
    }
}
