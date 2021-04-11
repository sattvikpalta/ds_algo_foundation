package rec.intro;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xpnb2 = power(x, n / 2);
        int xpn = xpnb2 * xpnb2;

        if (n % 2 == 1) {
            xpn *= x;
        }

        return xpn;
    }

}
