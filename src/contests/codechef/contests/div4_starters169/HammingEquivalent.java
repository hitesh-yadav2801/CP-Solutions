package contests.codechef.contests.div4_starters169;

import java.util.Scanner;

public class HammingEquivalent {
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
            String result = solve(n, arr);
            System.out.println(result);
        }
        sc.close();
    }
    public static int countSetBits(int x) {
        return Integer.bitCount(x);
    }

    private static String solve(int n, int[] arr) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if(countSetBits(arr[i]) != countSetBits(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag ? "YES" : "NO";
    }
}