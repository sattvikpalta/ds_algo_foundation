package basics.gettingstarted;

import java.util.Scanner;

public class PrimeFact {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int div = 2;

        while (n != 1) {
            if (n % div == 0) {
                System.out.print(div + " ");
                n /= div;
                continue;
            }

            div++;
        }
    }

}
