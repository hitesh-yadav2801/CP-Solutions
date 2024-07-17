package contests.div3_july_11_2024;

import java.util.Scanner;

public class OnlyPulses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            int maxBananas = getMaxBananas(a, b, c);
            System.out.println(maxBananas);
        }
        sc.close();
    }
    static int getMaxBananas(int a, int b, int c) {
        int maxBananas = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                int k = 5 - i - j;
                int newA = a + i;
                int newB = b + j;
                int newC = c + k;
                int product = newA * newB * newC;
                if (product > maxBananas) {
                    maxBananas = product;
                }
            }
        }
        return maxBananas;
    }
}
