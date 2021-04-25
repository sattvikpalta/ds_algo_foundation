package basics.gettingstarted;

import java.util.Scanner;

public class InvNum {
    // Program to calculate inverse of a number
    // Inverse of 35214 is 41532
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 35214)
        int n = scn.nextInt();
        scn.close();

        int inv = 0;

        // 'i' to calculate the place of a number
        int i = 1;
        // Loop till 'n' is not 0
        while (n != 0) {
            // Calculate remainder as 'rem'
            int rem = n % 10;

            // iPlace => Place for 'i'
            int iPlace = i * (int) Math.pow(10, rem - 1); // iPlace = 1 x 10 ^ (4 - 1)
            
            // Add 'i' in 'inv' at the correct place
            inv += iPlace; // inv = 1000, i.e 1 is at the 4th place
            // Remove the placed digit by dividing 'n' by 10
            n /= 10;
            // Increment 'i' for the next digit
            i++; // i = 2
        }

        System.out.println(inv);
    }

}
