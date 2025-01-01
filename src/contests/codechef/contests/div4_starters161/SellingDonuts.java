package contests.codechef.contests.div4_starters161;

import java.util.Scanner;

public class SellingDonuts {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();

        while(testCases-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            int[] arr1 = new int[n+1];
            int[] arr2 = new int[m+2];

            for(int i = 1; i <=n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i = 1; i <=m; i++){
                arr2[i] = sc.nextInt();
            }

            int sadCustomers = solve(n, m, arr1, arr2);
            System.out.println(sadCustomers);
        }
    }
    static int solve(int n, int m, int[] arr1, int[] arr2){
        int sad = 0;
        for(int i = 1; i <=m; i++){
            if(arr1[arr2[i]] != 0){
                arr1[arr2[i]]--;
            } else {
                sad++;
            }
        }
        return sad;
    }
}
