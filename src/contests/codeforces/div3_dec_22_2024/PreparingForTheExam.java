package contests.codeforces.div3_dec_22_2024;

import java.util.*;

public class PreparingForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[m];
            Set<Integer> knownQuestions = new HashSet<>();

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                knownQuestions.add(sc.nextInt());
            }

            String result = solve(n, arr, knownQuestions);
            System.out.println(result);
        }
        sc.close();
    }

    static String solve(int n, int[] arr, Set<Integer> knownQuestions) {
        int k = knownQuestions.size();
        int m = arr.length;
        StringBuilder sb = new StringBuilder();
        if (k == n) {
            for (int i = 0; i < m; i++) {
                sb.append('1');
            }
        } else if (k <= n - 2) {
            for (int i = 0; i < m; i++) {
                sb.append('0');
            }
        } else {
            for (int i = 1; i <= m; i++) {
                if (!knownQuestions.contains(i)) {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
            }
        }
        return sb.toString();
    }

    static String solve1(int n, int[] arr, Set<Integer> knownQuestions) {
        StringBuilder sb = new StringBuilder();

        for (int missingQuestion : arr) {
            boolean canPass = true;
            for (int question = 1; question < n; question++) {
                if (question != missingQuestion && !knownQuestions.contains(question)) {
                    canPass = false;
                    break;
                }
            }
            sb.append(canPass ? '1' : '0');
        }

        return sb.toString();
    }
}