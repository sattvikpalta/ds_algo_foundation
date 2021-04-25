package basics.gettingstarted;

import java.util.Scanner;

public class RevNum {
    // Program to calculate reverse of a number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 1234)
        int n = scn.nextInt();
        scn.close();

        int rev = 0;

        // Loop till number is not equal to zero
        while (n != 0) {
            // Calculate remainder by dividing by 10
            int rem = n % 10; // rem = 4

            // Calculate reversed number by adding remainder and multiplying 'rev' by 10 for
            // next place
            rev = rem + rev * 10; // rev = 4
            
            // Remove the remainder from 'n' by dividing 'n' by 10
            n /= 10; // n = 123
        }

        System.out.println(rev);
    }

}
