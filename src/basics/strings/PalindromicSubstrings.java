package basics.strings;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j <= str.length(); j++)
                if (isPalindrome(str.substring(i, j)))
                    System.out.println(str.substring(i, j));

    }

}
