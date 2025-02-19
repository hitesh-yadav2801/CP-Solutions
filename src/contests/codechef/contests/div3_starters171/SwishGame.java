package contests.codechef.contests.div3_starters171;

import java.util.Scanner;

public class SwishGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = solve(m, k, s);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int m, int k, String s) {
        int swiss = 0;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == 'S') {
                swiss++;
            }
        }
        if (swiss >= k) {
            return m;
        }
        int n = m + k - swiss - 1;

        return n;
    }
}
