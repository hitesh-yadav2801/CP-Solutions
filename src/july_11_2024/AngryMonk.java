package july_11_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                arr.add(sc.nextInt());
            }
            int minSteps = solve(arr);
            System.out.println(minSteps);
        }
        sc.close();
    }
    static int solve(ArrayList<Integer> arr){
        Collections.sort(arr, Collections.reverseOrder());
        int minSteps = 0;
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) >= 2){
                minSteps += arr.get(i) + arr.get(i) - 1;
            }
            if(arr.get(i) == 1) minSteps++;
        }

        return minSteps;
    }
}
