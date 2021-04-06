package bas.pattern;

import java.util.Scanner;

public class ElevensTriangle {
    public static void main(String[] args) {
        // Formula used
        // nC(k+1) = nCk * (n-k)/(k+1)
        // where n = row number and k = column number
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        for (int row = 0; row < numRows; row++) {
            int rowCcol = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(rowCcol + " ");
                int rowCcolp1 = rowCcol * (row - col) / (col + 1);
                rowCcol = rowCcolp1;
            }

            System.out.println();
        }
    }
}
