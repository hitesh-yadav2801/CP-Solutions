package contests.codechef.contests.div3_starters175;

import java.util.Scanner;

public class MakeSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();  // Consume the newline

        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();

            int result = solve(n, s1, s2, s3);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int n, String s1, String s2, String s3) {
        int ones1 = 0, ones2 = 0, ones3 = 0;
        int zeros1 = 0, zeros2 = 0, zeros3 = 0;

        // Count 0s and 1s in each string
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == '1') ones1++; else zeros1++;
            if (s2.charAt(i) == '1') ones2++; else zeros2++;
            if (s3.charAt(i) == '1') ones3++; else zeros3++;
        }

        int totalOnes = ones1 + ones2 + ones3;
        int totalZeros = zeros1 + zeros2 + zeros3;
        if (totalZeros % n != 0 || totalOnes % n != 0) {
            return -1;
        }
        if (totalZeros == 3 * n || totalOnes == 3 * n) {
            return 0;
        } else if (totalZeros == 2 * n ) {
            return Math.min(zeros1, Math.min(zeros2, zeros3));
        } else {
            return Math.min(ones1, Math.min(ones2, ones3));
        }
    }
}
