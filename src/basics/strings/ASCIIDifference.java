package basics.strings;

import java.util.Scanner;

public class ASCIIDifference {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length() - 1; i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i + 1) - str.charAt(i));
        }

        sb.append(str.charAt(str.length() - 1));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(solution(str));
    }
}
