package basics.funcnarrays;

import java.util.Scanner;

public class BarChart {
    // Program to represent an array as a bar chart

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input (Example: 5)
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        // arr = {2, 5, 0, 3, 4}
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        // Loop from the max element till 0
        for (int floor = max; floor > 0; floor--) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[col] >= floor) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}
