package contests.codechef.contests.div4_starters164;

import java.util.Scanner;

public class ItzSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String result = solve(n, k, p, arr);
            System.out.println(result);
        }
    }

    static String solve(int n, int k, int p, int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int varunSum = sum - max + p;
        int vedSum = k + max;
        if (vedSum > varunSum) {
            return "Ved";
        } else if (varunSum > vedSum) {
            return "Varun";
        } else {
            return "Equal";
        }
    }
}
