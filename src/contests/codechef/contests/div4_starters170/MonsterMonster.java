package contests.codechef.contests.div4_starters170;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MonsterMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            Long[] arr = new Long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long result = solve(n, x, arr);
            System.out.println(result);
        }
        sc.close();
    }

    private static long solve(long n, long x, Long[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] += (i * x);
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
