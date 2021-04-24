package basics.gettingstarted;

import java.util.Scanner;

//Program to check if a number is prime or not
public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Total numbers to be checked
        int t = scn.nextInt();
        scn.close();

        // Loop over total numbers
        for (int i = 0; i < t; i++) {
            // Number to be checked
            int n = scn.nextInt();
            int count = 0;

            // Loop from 2 to the square root of number
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    // If any number divides then count is increased
                    count++;
                    // If even one number divides no need to check further break and say not prime
                    break;
                }
            }

            // Count = 0 indicates no number was able to divide so print prime else print
            // not prime
            if (count == 0) {
                System.out.println(n + ": Prime");
            } else {
                System.out.println(n + ": Not Prime");
            }
        }
    }
}
