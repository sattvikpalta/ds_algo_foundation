package basics.strings;

import java.util.Scanner;

public class StringPermutations {
    public static void solution(String str) {
        int fact = factorial(str.length());

        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for (int div = sb.length(); div > 0; div--) {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }

            System.out.println();
        }

    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = n; i > 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        solution(str);
    }

}
