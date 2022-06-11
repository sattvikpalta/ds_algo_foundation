package basics.gettingstarted;

import java.util.Scanner;

public class RotNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int numOfRotations = scn.nextInt();
        scn.close();

        int numOfDigits = 0;
        int numCopy = num;
        while (numCopy != 0) {
            numCopy /= 10;
            numOfDigits++;
        }

        numOfRotations %= numOfDigits;
        if (numOfRotations < 0){
            numOfRotations += numOfDigits;
        }

        int divisor = 1;
        int multiplier = 1;
        for(int i = 1; i <= numOfDigits; i++) {
            if(i <= numOfRotations) {
                divisor *= 10;
            } else {
                multiplier *= 10;
            }
        }

        int quotient = num / divisor;
        int remainder = num % divisor;

        System.out.println(remainder * multiplier + quotient);
    }
}
