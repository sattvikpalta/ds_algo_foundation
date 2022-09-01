package basics.strings;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str) {
        String resultStr = "" + str.charAt(0);
        for (int prevIdx = 0, currIdx = 1; currIdx < str.length(); prevIdx++, currIdx++)
            if (str.charAt(currIdx) != str.charAt(prevIdx))
                resultStr += str.charAt(currIdx);

        return resultStr;
    }

    public static String compression2(String str) {
        String resultStr = "" + str.charAt(0);
        int count = 1;
        for (int prevIdx = 0, currIdx = 1; currIdx < str.length(); prevIdx++, currIdx++) {
            if (str.charAt(currIdx) != str.charAt(prevIdx)) {
                if (count > 1) {
                    resultStr += count;
                    count = 1;
                }
                resultStr += str.charAt(currIdx);
            } else {
                count++;
            }
        }

        if (count > 1)
            resultStr += count;

        return resultStr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}
