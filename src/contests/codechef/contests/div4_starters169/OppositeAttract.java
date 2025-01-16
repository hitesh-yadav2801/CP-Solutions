package contests.codechef.contests.div4_starters169;

import java.util.Scanner;

public class OppositeAttract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String result = solve(n, s);
            System.out.println(result);
        }
        sc.close();
    }

    private static String solve(int n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
