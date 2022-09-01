package basics.strings;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        String resultStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) < 'z')
                resultStr += (char) (str.charAt(i) - 'a' + 'A');
            else
                resultStr += (char) (str.charAt(i) - 'A' + 'a');
        }

        return resultStr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(toggleCase(str));
    }
}
