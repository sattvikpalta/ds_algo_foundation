package rec.intro;

import java.util.Scanner;

public class PrintIncDec {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        printIncDec(n);
    }

    public static void printIncDec(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        printIncDec(n - 1);
        System.out.println(n);
    }

}
