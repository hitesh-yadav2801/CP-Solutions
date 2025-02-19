package contests.codechef.contests.div3_starters174;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeletionAndDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
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
        int minLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (key == 0){
                continue;
            }
            int freq = map.get(key);
            int rem = freq % 2;
            if (rem == 1) {
                minLen += 1;
            }
        }
        if (minLen == n){
            return n;
        }

        return minLen + 1;
    }
}
