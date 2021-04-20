package rec.recwayup;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        } else if (ques.length() == 1) {
            char ch = ques.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chValue = ch - '0';
                char code = (char) ('a' + chValue - 1);
                System.out.println(ans + code);
            }
        } else {
            char ch = ques.charAt(0);
            String roq = ques.substring(1);

            if (ch == '0') {
                return;
            } else {
                int chValue = ch - '0';
                char code = (char) ('a' + chValue - 1);
                printEncodings(roq, ans + code);
            }

            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);

            int ch12Value = Integer.parseInt(ch12);
            if (ch12Value <= 26) {
                char code = (char) ('a' + ch12Value - 1);
                printEncodings(roq12, ans + code);
            }
        }
    }

}
