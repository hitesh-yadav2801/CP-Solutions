package contests.codechef.contests.div4_starters165;

import java.util.Scanner;

public class StableArray {
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
            int result = solution(n, arr);
            System.out.println(result);
        }
        sc.close();
    }

    static int solution(int n, int[] arr) {
        boolean isStable;
        int seconds = 0;
        do {
            isStable = true;
            for (int i = 0; i < n - 1; i++) {
                if(arr[i] < arr[i + 1]){
                    arr[i] = arr[i + 1];
                    isStable = false;
                }
            }
            if (!isStable) {
                seconds++;
            }
        } while (!isStable);
        return seconds;
    }
}
