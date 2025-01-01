package contests.codeforces.div3_dec_22_2024;


import java.util.Scanner;

public class PreparingForTheOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
            }
            int result = solve(n, arr, brr);
            System.out.println(result);
        }
        sc.close();
    }
    static int solve(int n, int[] arr, int[] brr) {
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > brr[i + 1]) {
                sum += (arr[i] - brr[i + 1]);
            }
        }
        sum += arr[n - 1];

        return sum;
    }
}
