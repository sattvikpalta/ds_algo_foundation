package rec.intro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();

        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;

        return num * factorial(num - 1);
    }

}
