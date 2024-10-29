package ALPHA;

import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        int n;
        int div = 2;

        System.out.println("Enter The number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (div<n) {

            if ( n%div==0) {
                System.out.println("number is not prime");
            }else{
                div = div+1;
              
            }
           
        }
        System.out.println("this number is prime");
    }
}
