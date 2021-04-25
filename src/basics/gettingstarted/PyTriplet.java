package basics.gettingstarted;

import java.util.Scanner;

public class PyTriplet {
    // Program to check if a given set of numbers is a valid pythagorean triplet

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input numbers
        int a = scn.nextInt(); // 4
        int b = scn.nextInt(); // 5
        int c = scn.nextInt(); // 3
        scn.close();

        if (a * a == b * b + c * c) { 
            System.out.println("true");
        } else if (b * b == a * a + c * c) { // 5 x 5 = 4 x 4 + 3 x 3
            System.out.println("true");
        } else if (c * c == b * b + a * a) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
