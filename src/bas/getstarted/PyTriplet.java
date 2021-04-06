package bas.getstarted;

import java.util.Scanner;

public class PyTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();

        if (a * a == b * b + c * c) {
            System.out.println("true");
        } else if (b * b == a * a + c * c) {
            System.out.println("true");
        } else if (c * c == b * b + a * a) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
