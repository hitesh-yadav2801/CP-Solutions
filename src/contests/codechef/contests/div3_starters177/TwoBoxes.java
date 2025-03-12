package contests.codechef.contests.div3_starters177;

import java.util.Scanner;

public class TwoBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int result = solve(x, y, k);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int x, int y, int k) {
        if((x + y) % 2 == 0 && k % 2 == 1){
            return -1;
        }
        if((x + y) % 2 == 1 &&  k % 2 == 0){
            return -1;
        }
        int ans = 0;
        int diff = Math.abs(x - y);
        diff = Math.abs(diff - k);
        return diff / 2;
//        while(Math.abs(x - y) != k){
//            if (x > y){
//                x--;
//                y++;
//            } else {
//                x++;
//                y--;
//            }
//            ans++;
//        }
//        return ans;
    }
}
