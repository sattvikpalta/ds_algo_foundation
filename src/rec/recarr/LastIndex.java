package rec.recarr;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();
        scn.close();

        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return -1;

        int secondLastIdx = lastIndex(arr, idx + 1, x);
        if (secondLastIdx == -1)
            if (arr[idx] == x)
                return secondLastIdx;
            else
                return -1;
        else
            return secondLastIdx;
    }

}
