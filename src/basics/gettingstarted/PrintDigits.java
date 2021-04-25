package basics.gettingstarted;

import java.util.Scanner;

public class PrintDigits {
    // Program to print digits of a number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 7654)
        int n = scn.nextInt();
        scn.close();

        // Copy of 'n' in 'temp' to not disturb the original number
        int temp = n;
        // Count to identify the total iterations of the loop
        int count = 0;

        // Loop to calculate total digits in the number
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Variable 'div' as divisor, which is 10 to the power of count - 1 (div = 10 ^ 3)
        int div = (int) Math.pow(10, count - 1);

        while (div != 0) {
            // Divides by 10 to remove digits
            int q = n / div; // q = 7

            // Prints digit after removing
            System.out.println(q);

            // Makes 'n' remainder of 'n' and 'div'
            n %= div; // n = 654

            // Divides 'div' by 10
            div /= 10; // div = 10 ^ 2
        }

    }

}
