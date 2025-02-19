package contests.codechef.contests.div4_starters170;

import java.util.Scanner;

public class CrazyJumpingFrogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = solve(n, arr);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int n, int[] arr) {
        return 0;
    }
}
