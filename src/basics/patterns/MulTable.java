package basics.patterns;

import java.util.Scanner;

public class MulTable {
    // Program to print multiplication table of a given number
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

}
