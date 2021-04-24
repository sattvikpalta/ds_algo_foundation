package basics.gettingstarted;

import java.util.Scanner;

public class NFibo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int first = 0;
        int second = 1;
        int i = 0;

        while(i < n){
            System.out.println(first);
            int third = first + second;
            first = second;
            second = third;
            i++;
        }
    }
    
}
