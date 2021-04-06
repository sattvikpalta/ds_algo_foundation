package bas.funcnarray;

import java.util.Scanner;

public class DecToAny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        scn.close();

        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int power = 0;

        while (n != 0) {
            int rem = n % b;
            rv += rem * (int) Math.pow(10, power);
            n /= b;
            power++;
        }

        return rv;
    }

}
