package contests.codechef.contests.div4_starters164;

import java.util.Scanner;

public class SwapAndFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            String T = sc.nextLine();
            String result = solve(n, S, T);
            System.out.println(result);
        }
        sc.close();
    }

    static String solve(int n, String S, String T) {
        if (n == 1) {
            if (S.charAt(0) == T.charAt(0)) {
                return "YES";
            }
            return "NO";
        }
        int zeroCountS = 0;
        int oneCountS = 0;
        int zeroCountT = 0;
        int oneCountT = 0;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '0') {
                zeroCountS++;
            } else {
                oneCountS++;
            }
            if (T.charAt(i) == '0') {
                zeroCountT++;
            } else {
                oneCountT++;
            }
        }
        if ((zeroCountS - zeroCountT) % 2 == 0 && (oneCountS - oneCountT) % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
}
