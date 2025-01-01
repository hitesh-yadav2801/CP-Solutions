package contests.codechef.practice.beginner.strings;

import java.util.Scanner;

public class DnaStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String result = solve(s, n);
            System.out.println(result);
        }
        sc.close();
    }

    static String solve(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n - 2; i = i + 2) {
            String pair = s.substring(i, i + 2);
            switch (pair) {
                case "00" -> sb.append("A");
                case "01" -> sb.append("T");
                case "10" -> sb.append("C");
                case "11" -> sb.append("G");
            }
        }
        return sb.toString();
    }
}
