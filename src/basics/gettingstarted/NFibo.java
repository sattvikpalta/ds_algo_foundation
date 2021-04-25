package basics.gettingstarted;

import java.util.Scanner;

public class NFibo {
    // Program to print all fibonacci numbers till n (using iteration)

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 5)
        int n = scn.nextInt();
        scn.close();

        int first = 0; // 1st fibonacci number is 0
        int second = 1; // 2nd fibonacci number is 1

        int i = 0;
        while (i < n) {
            System.out.println(first);
            int third = first + second; // Next fibonacci is a sum of previous 2
            first = second; // first = 1
            second = third; // second = 1
            i++;
        }
    }

}
