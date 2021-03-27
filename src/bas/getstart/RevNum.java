package bas.getstart;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rem + rev * 10;
            n /= 10;
        }

        System.out.println(rev);
    }

}
