package contests.codechef.contests.div4_starters164;

import java.util.Scanner;

public class NewProCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m >= (float)n/2){
            System.out.println("NEWBIE");
        } else {
            System.out.println("PRO");
        }
    }
}

