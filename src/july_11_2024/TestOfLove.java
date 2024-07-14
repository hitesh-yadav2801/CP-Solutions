package july_11_2024;

import java.util.Arrays;
import java.util.Scanner;

public class TestOfLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[n] = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (str.charAt(i) == 'C') {
                    dp[i] = Integer.MAX_VALUE;
                } else if (str.charAt(i) == 'W') {
                    dp[i] = dp[i + 1] == Integer.MAX_VALUE ? Integer.MAX_VALUE : dp[i + 1] + 1;
                } else {
                    for (int j = i + 1; j <= i + m && j <= n; j++) {
                        dp[i] = Math.min(dp[i], dp[j]);
                    }
                }
            }

            int result = dp[0];
            for (int j = 0; j < m && j <= n; j++) {
                result = Math.min(result, dp[j]);
            }

            System.out.println(result <= k ? "YES" : "NO");
        }
        sc.close();
    }
}
