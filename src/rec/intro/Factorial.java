package rec.intro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        int fact = n;
        fact *= factorial(n - 1);
        return fact;
    }

}
