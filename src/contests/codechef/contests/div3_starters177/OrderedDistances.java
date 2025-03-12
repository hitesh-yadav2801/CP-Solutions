package contests.codechef.contests.div3_starters177;


import java.util.*;
import java.util.Scanner;

public class OrderedDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[n];
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.nextLine();
            for(int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
            }
            int result = solve(n, arr, brr);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int n, int[] arr, int[] brr) {
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            int pivot = arr[i];
            boolean isPivot = true;
            for (int j = 0; j < n; j++) {
                list[j][0] = Math.abs(arr[j] - pivot);
                list[j][1] = arr[j];
            }
            Arrays.sort(list, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0]) {
                        return Integer.compare(o1[0], o2[0]);
                    } else {
                        return Integer.compare(o1[1], o2[1]);
                    }
                }
            });
            for (int j = 0; j < n; j++) {
                if (list[j][1] != brr[j]) {
                    isPivot = false;
                    break;
                }
            }
            if (isPivot) {
                return i + 1;
            }
        }
        return -1;
    }
}
