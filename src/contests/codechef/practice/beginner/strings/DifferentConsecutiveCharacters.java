package contests.codechef.practice.beginner.strings;

import java.util.Scanner;

public class DifferentConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = solve(s, n);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(String s, int n) {
        int count = 0;
        int prevIdx = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count += i - prevIdx - 1;
                prevIdx = i;
            }
        }
        if (prevIdx != n - 1) {
            count += n - prevIdx - 1;
        }
        return count;
    }
}
