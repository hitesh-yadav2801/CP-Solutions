package contests.codechef.contests.div3_starters171;

import java.util.Scanner;

public class Advitiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            String s = sc.nextLine();
            int result = solve(s);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(String s) {
        int ans = 0;
        String t = "ADVITIYA";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                int diff = t.charAt(i) - s.charAt(i);
                if (diff < 0) {
                    diff += 26;
                }
                ans += diff;
            }
        }
        return ans;
    }
}
