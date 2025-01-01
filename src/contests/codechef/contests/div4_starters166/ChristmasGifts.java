package contests.codechef.contests.div4_starters166;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int h = sc.nextInt();
            int l = sc.nextInt();
            int w = sc.nextInt();

            int result = solve(h, l, w);
            System.out.println(result);
        }
    }
    static int solve(int h, int l, int w){
        int ans = 0;
        int areaOfOne = 2 *(h*l + l*w + h*w);
        ans = 1000 / areaOfOne;
        return ans;
    }
}
