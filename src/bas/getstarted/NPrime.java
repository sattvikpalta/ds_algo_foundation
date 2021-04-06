package bas.getstarted;

import java.util.Scanner;

public class NPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        scn.close();

        while (lo <= hi) {
            int count = 0;
            for (int div = 2; div * div <= lo; div++) {
                if (lo % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(lo);
            }

            lo++;
        }
    }
}
