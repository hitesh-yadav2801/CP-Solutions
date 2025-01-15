package contests.codechef.contests.div4_starters168;

import java.util.Scanner;

public class BinaryRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = solve(n, s, x, k);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int n, String s, int x, int k) {
        return 0;
    }
}
