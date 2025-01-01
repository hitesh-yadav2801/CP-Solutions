package contests.codechef.contests.div4_starters167;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryTickets {
    static int MAX_NUM = 1000000;

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
            int result = solve(n, arr);
//            long result = countWinningNumbers(arr);
            System.out.println(result);
        }
    }

    static long countWinningNumbers(int[] tickets) {
        int chefTicket = tickets[0];
        Arrays.sort(tickets);
        long count = 0;


        int chefPos = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == chefTicket) {
                chefPos = i;
                break;
            }
        }


        for (int i = 0; i < tickets.length - 1; i++) {
            int midPoint = (tickets[i] + tickets[i + 1]) / 2;


            if (i == chefPos) {
                count += midPoint - tickets[i] + 1;
            } else if (i + 1 == chefPos) {
                count += tickets[i + 1] - midPoint;
            }
        }


        if (chefPos == 0) {

            count += tickets[0] - 1;
        }
        if (chefPos == tickets.length - 1) {

            count += 1000000 - tickets[tickets.length - 1];
        }

        return count;
    }

    private static int solve(int n, int[] arr) {
        int leftNearest = -1;
        int rightNearest = 1000000;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[0] && arr[i] > leftNearest) {
                leftNearest = arr[i];
            }
            if (arr[i] > arr[0] && arr[i] < rightNearest) {
                rightNearest = arr[i];
            }
        }
        if (leftNearest == -1) {
            count += arr[0] - 1;
        } else {
            count += (arr[0] - leftNearest) / 2;
        }
        if (rightNearest == 1000000) {
            count += 1000000 - arr[0];
        } else {
            count += (rightNearest - arr[0]) / 2;
        }

        return count + 1;
    }
}
