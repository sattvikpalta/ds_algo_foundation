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

        //Make copies to not disturb
        int temp1 = n1;
        int temp2 = n2;

        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }

        System.out.println(temp2);
        System.out.println((n1 * n2) / temp2);
    }

}
