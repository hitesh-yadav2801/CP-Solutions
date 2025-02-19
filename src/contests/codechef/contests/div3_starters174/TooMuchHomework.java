package contests.codechef.contests.div3_starters174;

import java.util.Scanner;

public class TooMuchHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String result = solve(x, y);
        System.out.println(result);
    }

    private static String solve(int x, int y) {
        int remQuestions = 100 - x;
        if (10 * y >= remQuestions) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
