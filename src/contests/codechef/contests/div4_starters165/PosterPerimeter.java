package contests.codechef.contests.div4_starters165;

import java.util.Scanner;

public class PosterPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int result = solve(n, m, k);
            System.out.println(result);
        }
        sc.close();
    }

    static int solve(int n, int m, int k) {
        int maxPerimeter = 2 * (n + m);
        if(maxPerimeter <= k){
            return Math.abs(maxPerimeter - k);
        }
        int maxDiff = Integer.MAX_VALUE;
        for (int i = n; i > 0; i--) {
            for (int j = m; j > 0; j--) {
                int curPerimeter = 2 * (i + j);
                maxDiff = Math.min(maxDiff, Math.abs(curPerimeter - k));
            }
        }
        return maxDiff;
    }
}
