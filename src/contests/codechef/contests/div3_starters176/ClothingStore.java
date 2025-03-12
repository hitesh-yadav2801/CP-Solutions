package contests.codechef.contests.div3_starters176;

import java.util.Scanner;

public class ClothingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = solve(x, y, z, a, b, c);
            System.out.println(result);
        }
    }

    private static int solve(int x, int y, int z, int a, int b, int c) {
        int ans = 0;
        if(c >= z){
            ans += z;
        } else {
            int diff = z - c;
             y += diff;
            ans += c;
        }

        if(b >= y){
            ans += y;
        } else {
            int diff = y - b;
            x += diff;
            ans += b;
        }
        if(a >= x){
            ans += x;
        } else {
            ans += a;
        }
        return ans;
    }
}
