package contests.codechef.contests.div4_starters167;

import java.util.Scanner;

public class DeleteNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = solve(n, s);
            System.out.println(result);
        }
    }

    private static int solve(int n, String s) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeros++;
            }
        }
        if (ones == n || zeros == n) {
            return n;
        } else {
            return 1;
        }
    }
}
