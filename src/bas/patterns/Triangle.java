package bas.patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
