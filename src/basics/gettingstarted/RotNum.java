package basics.gettingstarted;

import java.util.Scanner;

public class RotNum {
    // Program to rotate a number

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input number (Example: 54321)
        int n = scn.nextInt();
        // Input rotations (Example: 3)
        int k = scn.nextInt();
        scn.close();

        // Copy to not disturb original number
        int temp = n;
        // Variable 'count' to calculate total digits
        int count = 0;

        // Loop to calculate count of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // To handle large rotations, as k = 21 for a 5 digit number is same as 1
        // rotation
        k = k % count;

        // To handle negative rotations, as k = -3 for a 5 digit number is same as 2
        // positive rotation
        if (k < 0) {
            k = k + count;
        }

        int div = (int) Math.pow(10, k); // div = 10 ^ 3
        int mul = (int) Math.pow(10, count - k); // mul = 10 ^ 2
        int quo = n / div; // quo = 54
        int rem = n % div; // rem = 321

        int rotNum = quo + rem * mul; // rotNum = 54 + 321 x 10 ^ 2 = 32154
        System.out.println(rotNum);
    }

}
