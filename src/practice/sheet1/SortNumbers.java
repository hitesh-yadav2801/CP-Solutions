package practice.sheet1;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tempA = a;
        int tempB = b;
        int tempC = c;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            int temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            int temp = b;
            b = c;
            c = temp;
        }
        sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(tempA);
        System.out.println(tempB);
        System.out.println(tempC);
        sc.close();
    }
}
