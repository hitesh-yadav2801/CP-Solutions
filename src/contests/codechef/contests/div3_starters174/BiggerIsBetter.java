package contests.codechef.contests.div3_starters174;

import java.util.Scanner;

public class BiggerIsBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String result = solve(n, s);
            System.out.println(result == null ? -1 : result);
        }
        sc.close();
    }

    private static String solve(int n, String s) {
        StringBuilder sb = new StringBuilder();
        boolean isAllZ = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != 'z'){
                isAllZ = false;
                break;
            }
        }
        if (!isAllZ) {
            for (int i = 0; i < n; i++) {
                sb.append("z");
            }
            return sb.toString();
        }
        return null;
    }
}
