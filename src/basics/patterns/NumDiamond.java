package basics.patterns;

import java.util.Scanner;

public class NumDiamond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        int spaceCount = numRows / 2;
        int starCount = 1;
        int val = 0;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= spaceCount; col++) {
                System.out.print("\t");
            }

            for (int col = 1; col <= starCount; col++) {
                if (col <= starCount / 2 + 1)
                    System.out.print(++val + "\t");
                else
                    System.out.print(--val + "\t");

            }

            System.out.println();

            if (row <= numRows / 2) {
                spaceCount--;
                starCount += 2;
            } else {
                val -= 2;
                spaceCount++;
                starCount -= 2;
            }
        }
    }
}
