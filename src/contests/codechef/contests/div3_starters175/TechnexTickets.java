package contests.codechef.contests.div3_starters175;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnexTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int result = solve(n);
            System.out.println(result);
        }
        sc.close();
    }

    private static int solve(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return (n / 2) + 1;
        } else {
            return n / 2;
        }
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(i + 1);
//        }
//        int seconds = 0;
//        while (list.size() > 2) {
//            int third = list.get(2);
//            if (third == n){
//                return seconds + 1;
//            }
//            list.remove(0);
//            list.remove(1);
//            seconds++;
//        }
//        return seconds + list.size();
    }
}
