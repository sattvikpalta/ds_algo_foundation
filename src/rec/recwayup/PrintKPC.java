package rec.recwayup;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        scn.close();

        printKPC(ques, "");
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String chCode = codes[ch - '0'];
        for (int i = 0; i < chCode.length(); i++) {
            printKPC(roq, ans + chCode.charAt(i));
        }
    }

}
