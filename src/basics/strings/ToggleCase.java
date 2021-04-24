package basics.strings;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                sb.append((char)(str.charAt(i) + 'A' - 'a'));
            } else {
                sb.append((char)(str.charAt(i) + 'a' - 'A'));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(toggleCase(str));
    }
}
