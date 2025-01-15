package contests.codechef.contests.div4_starters168;

import java.util.Scanner;

public class MakeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            String result = solve(n, a, b);
            System.out.println(result);
        }
        sc.close();
    }

    private static String solve(int n, String a, String b) {
        int sameOnes = 0;
        int diffChars = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                sameOnes++;
            } else if (a.charAt(i) != b.charAt(i)) {
                diffChars++;
            }
        }
        if(sameOnes % 2 == 1){
            return "YES";
        }
        return diffChars > 0 ? "YES" : "NO";
    }
}
