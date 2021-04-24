package basics.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
    public static void solution(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }

    }

    public static boolean isPrime(int n) {
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }

        scn.close();

        solution(al);
        System.out.println(al);
    }

}
