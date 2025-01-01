package contests.codechef.contests.div4_starters166;

import java.util.Scanner;

public class DivisorsArrayEasy {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] result = solve(n, m, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + (i == n-1 ? "" : " "));
        }
        sc.close();
    }

    private static long[] solve(int n, int m, long[] A) {
        // Calculate M!
        long mFactorial = 1;
        for (int i = 2; i <= m; i++) {
            mFactorial = (mFactorial * i) % MOD;
        }

        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            // Calculate Bi = Ai × M!
            long bi = (A[i] * mFactorial) % MOD;

            // Count divisors of bi
            result[i] = countDivisors(bi);
        }

        return result;
    }

    private static long countDivisors(long n) {
        if (n == 0) return 0;

        long count = 0;
        long sqrt = (long) Math.sqrt(n);

        for (long i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count = (count + 1) % MOD;
                if (i * i != n) {
                    count = (count + 1) % MOD;
                }
            }
        }

        return count;
    }
}