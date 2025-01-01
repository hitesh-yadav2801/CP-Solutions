package contests.codechef.contests.div4_starters166;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheflandLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = solve(n, arr);
            System.out.println(ans);
        }
    }

    private static int solve(int n, int[] arr) {
        int penalty = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                if (map.get(key) < i) {
                    map.put(key, i);
                }
            } else {
                map.put(key, i);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            penalty += value;
        }
        return penalty;
    }
}
