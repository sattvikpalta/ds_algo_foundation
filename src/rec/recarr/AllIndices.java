package rec.recarr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndices {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    // fsf -> found so far
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        if (arr[idx] == x) {
            int[] rv = allIndices(arr, x, idx + 1, fsf + 1);
            rv[fsf] = idx;
            return rv;
        } else {
            int[] rv = allIndices(arr, x, idx + 1, fsf);
            return rv;
        }

    }

}
