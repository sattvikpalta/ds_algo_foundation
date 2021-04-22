package dp.dpngreedy;

import java.util.Scanner;

public class FibonacciMemoized {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        long t1 = System.currentTimeMillis();
        System.out.println(fibonacci(n));
        System.out.println(System.currentTimeMillis() - t1);

        System.out.println();

        long t2 = System.currentTimeMillis();
        System.out.println(fibonacciMemoised(n, new int[n + 1]));
        System.out.println(System.currentTimeMillis() - t2);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciMemoised(int n, int[] bank) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (bank[n] != 0) {
            return bank[n];
        }

        int fn = fibonacciMemoised(n - 1, bank) + fibonacciMemoised(n - 2, bank);
        bank[n] = fn;

        return fn;
    }

}
