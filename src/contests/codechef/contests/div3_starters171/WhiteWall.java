package contests.codechef.contests.div3_starters171;

import java.util.Scanner;

public class WhiteWall {
    private static final String[] PATTERNS = {
            "RGB", "RBG", "GRB", "GBR", "BRG", "BGR"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int minChanges = Integer.MAX_VALUE;
            for (String pattern : PATTERNS) {
                int currentChanges = 0;
                for (int i = 0; i < N; i++) {
                    char expected = pattern.charAt(i % 3);
                    if (S.charAt(i) != expected) {
                        currentChanges++;
                    }
                }
                if (currentChanges < minChanges) {
                    minChanges = currentChanges;
                }
            }
            System.out.println(minChanges);
        }
        sc.close();
    }
}