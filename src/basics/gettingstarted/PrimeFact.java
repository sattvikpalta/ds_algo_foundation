package basics.gettingstarted;

import java.util.Scanner;

public class PrimeFact {
    // Program to print prime factorizations of a number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 56)
        int n = scn.nextInt();
        scn.close();

        int div = 2;

        while (n != 1) {
            if (n % div == 0) { // 56 % 2 = 0
                System.out.print(div + " "); // Print 2
                n /= div; // n = 28
                continue;
            }

            div++;
        }
    }

}
