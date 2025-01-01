package contests.atCoder.contests.beginner_contest385;

import java.util.Scanner;

public class Equally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("Yes");
        } else if((a + b == c) || (a + c == b) || (b + c == a)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
