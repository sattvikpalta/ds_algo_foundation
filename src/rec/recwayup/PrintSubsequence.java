package rec.recwayup;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        scn.close();

        printSS(ques, "");
    }

    public static void printSS(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans + "");
    }

}
