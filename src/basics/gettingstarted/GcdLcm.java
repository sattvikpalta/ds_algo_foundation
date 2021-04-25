package basics.gettingstarted;

import java.util.Scanner;

public class GcdLcm {
    // Program to calculate GCD and LCM of 2 numbers

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input 1 (Example: 24)
        int n1 = scn.nextInt();
        // Input 2 (Example: 48)
        int n2 = scn.nextInt();
        scn.close();

        // Copies in 'temp1' and 'temp2' to not disturb the original numbers
        int temp1 = n1;
        int temp2 = n2;

        // Loop to divide numbers till remainder != 0. Also handles cases where n1 < n2
        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2; // rem = 24 % 48 = 24
            temp1 = temp2; // temp1 = 48
            temp2 = rem; // temp2 = 24
        }

        System.out.println(temp2);
        System.out.println((n1 * n2) / temp2); // LCM x GCD = n1 x n2
    }

}
