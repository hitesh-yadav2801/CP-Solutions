package contests.codechef.practice.beginner.strings;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            String result = solve(s, t);
            System.out.println(result);
        }
        sc.close();
    }

    private static String solve(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                sb.append("G");
            } else {
                sb.append("B");
            }
        }
        return sb.toString();
    }
}
