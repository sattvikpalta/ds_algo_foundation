package basics.gettingstarted;

import java.util.Scanner;

public class NPrime {
    // Program to display prime numbers between 2 numbers

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // First number
        int lo = scn.nextInt();
        // Second number
        int hi = scn.nextInt();
        scn.close();

        // Loop till lo <= hi
        while (lo <= hi) {
            int count = 0;
            // Loop from 2 to square root of 'lo'
            for (int div = 2; div * div <= lo; div++) {
                if (lo % div == 0) {
                    // If a number divides 'lo' then increase count
                    count++;
                    // If even one number divides 'lo' no need to check further, break
                    break;
                }
            }

            // Count = 0 indicates no number was able to divide 'lo', so print prime else
            // print not prime
            if (count == 0) {
                System.out.println(lo);
            }

            // Increment 'lo' to check subsequent numbers
            lo++;
        }
    }
}
