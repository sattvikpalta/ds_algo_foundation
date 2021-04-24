package basics.gettingstarted;

import java.util.Scanner;

public class DigitCount {
    // Program to count digits in a number
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int count = 0;

        while (n != 0) {
            // Divide by 10 to remove digits
            n = n / 10;
            // For every digit removed increase count
            count++;
        }

        System.out.println(count);
    }

}
