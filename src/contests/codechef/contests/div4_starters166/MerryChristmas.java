package contests.codechef.contests.div4_starters166;

import java.util.Scanner;

public class MerryChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 3){
            System.out.println("1");
        } else if(x >= 3 && x < 7){
            System.out.println("2");
        } else {
            System.out.println("3");
        }

    }
}
