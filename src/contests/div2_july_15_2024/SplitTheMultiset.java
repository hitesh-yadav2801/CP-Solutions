package contests.div2_july_15_2024;

import java.util.Scanner;

public class SplitTheMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = (int) Math.ceil((double) ((n - 1)) / (k - 1));
            System.out.println(result);
        }
        sc.close();
    }

}
