package basics.gettingstarted;

import java.util.Scanner;

public class NPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        scn.close();
        
        while (low <= high) {
            int divisor = 2;

            while (divisor * divisor <= low) {
                if(low % divisor == 0) {
                    break;
                } 

                divisor++;
            }

            if(divisor * divisor > low) {
                System.out.println(low);
            }
             
            low++;
        }
    }
}
