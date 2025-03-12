package contests.codechef.contests.div3_starters176;

import java.util.*;
import java.util.Scanner;

public class CostlySummit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = solve(n, c, s);
            System.out.println(result);
        }
    }

    private static int solve(int n, int c, String s) {
        int[] counts = new int[5];
        for (char ch : s.toCharArray()) {
            counts[ch - 'A']++;
        }
        List<Integer> freqs = new ArrayList<>();
        for (int cnt : counts) {
            if (cnt > 0) {
                freqs.add(cnt);
            }
        }
        int m = freqs.size();
        int minCost = Integer.MAX_VALUE;
        for (int mask = 0; mask < (1 << m); mask++) {
            int sumSelected = 0;
            int count = 0;
            for (int i = 0; i < m; i++) {
                if ((mask & (1 << i)) != 0) {
                    sumSelected += freqs.get(i);
                    count++;
                }
            }
            int remaining = n - sumSelected;
            int cost = count * c + remaining * (remaining + 1) / 2;
            if (cost < minCost) {
                minCost = cost;
            }
        }
        return minCost;
    }
}
