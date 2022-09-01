package basics.strings;

import java.util.Scanner;

public class StringPermutations {
    public static int factorial(int num) {
        int fact = num;
        for (int i = num - 1; i > 0; i--)
            fact *= i;

        return fact;
    }

    public static void permutations(String str) {
        int totalPermutations = factorial(str.length());

        for (int i = 0; i < totalPermutations; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for (int div = str.length(); div > 0; div--) {
                int rem = temp % div;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp /= div;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        permutations(str);
    }

}
