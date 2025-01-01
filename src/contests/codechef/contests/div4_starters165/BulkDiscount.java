package contests.codechef.contests.div4_starters165;

import java.util.Arrays;
import java.util.Scanner;

public class BulkDiscount {
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
    static int solve(int n, int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - i <= 0) continue;
            ans += arr[i] - i;
        }
        return ans;
    }
}
