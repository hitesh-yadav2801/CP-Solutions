package contests.codechef.contests.div4_starters168;

import java.util.Scanner;

public class BigAchiever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] result = solve(n, arr);
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + (i == n-1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }

    private static int[] solve(int n, int[] arr) {
        int[] result = new int[n];
        int max = arr[0];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                result[i] = 1;
            } else {
                result[i] = 0;
            }
            max = Math.max(max, arr[i]);

        }
        return result;
    }
}
