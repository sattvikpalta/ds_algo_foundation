package basics.strings;

import java.util.Scanner;

public class ASCIIDifference {
    public static String solution(String str) {
        String resultStr = "" + str.charAt(0);
        for (int prevIdx = 0, currIdx = 1; currIdx < str.length(); prevIdx++, currIdx++) {
            resultStr += (int) ((str.charAt(currIdx) - str.charAt(prevIdx)));
            resultStr += (char) (str.charAt(currIdx));
        }

        return resultStr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(solution(str));
    }
}
