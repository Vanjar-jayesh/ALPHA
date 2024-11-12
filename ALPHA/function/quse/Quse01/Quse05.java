package Quse01;

import java.util.Scanner;

public class Quse05 {
    public static void  sumOFdigits(int n){

        int sum = 0;

        // for(int i=1; i<=n; i++){
        //     sum += i;
        // }
        // System.out.println(sum);

        while (n>0) {
            int ls = n%10;
            sum += ls;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");

        int n = sc.nextInt();
        sumOFdigits(n); 
    }
}