package rec.intro;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int pow = scn.nextInt();
        scn.close();

        System.out.println(power(num, pow));
    }

    public static int power(int num, int pow) {
        if (pow == 0)
            return 1;

        int result = power(num, pow / 2) * power(num, pow / 2);

        if (pow % 2 == 1)
            return result * num;
        else
            return result;
    }

}
