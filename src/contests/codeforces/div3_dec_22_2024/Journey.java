package contests.codeforces.div3_dec_22_2024;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = solve(n, a, b, c);
            System.out.println(result);
        }
        sc.close();
    }

    static int solve(int n, int a, int b, int c) {
        int oneCycle = a + b + c;
        int totalCyclesWalked = n / oneCycle;
        int totalDistanceWalked = totalCyclesWalked * oneCycle;
        int days = totalCyclesWalked * 3;

        while (totalDistanceWalked < n) {
            if(days % 3 == 0){
                totalDistanceWalked += a;
            } else if(days % 3 == 1){
                totalDistanceWalked += b;
            } else {
                totalDistanceWalked += c;
            }
            days++;
        }
        return days;
    }

    static int solveLinear(int n, int a, int b, int c) {
        long days = 0;
        long total = 0;
        while (total < n) {
            long remainder = days % 3;
            if (remainder == 0) {
                total += a;
            } else if (remainder == 1) {
                total += b;
            } else {
                total += c;
            }
            days++;
        }

        return (int) days;
    }

}

