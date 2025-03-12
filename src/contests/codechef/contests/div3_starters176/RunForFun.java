package contests.codechef.contests.div3_starters176;

import java.util.Scanner;

public class RunForFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = solve(x, y);
        System.out.println(result);
    }

    private static int solve(int x, int y) {
        if(x >= y){
            return 0;
        } else {
            if(y % x == 0){
                return (y/x) - 1;
            } else {
                return (y/x);
            }
        }
    }
}
