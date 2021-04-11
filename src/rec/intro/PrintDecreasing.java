package rec.intro;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
