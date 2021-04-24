package basics.gettingstarted;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }

}
