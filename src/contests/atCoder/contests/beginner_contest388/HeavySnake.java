package contests.atCoder.contests.beginner_contest388;

import java.util.Arrays;
import java.util.Scanner;

public class HeavySnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] thickness = new int[n];
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            thickness[i] = sc.nextInt();
            length[i] = sc.nextInt();
            sc.nextLine();
        }
        int[] result = solve(n, d, thickness, length);
        for (int i = 0; i < d; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solve(int n, int d, int[] thickness, int[] length) {
        int[] result = new int[d];
        for (int i = 0; i < d; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, thickness[j] * (length[j] + i + 1));
            }
            result[i] = max;
        }
        return result;
    }
}
