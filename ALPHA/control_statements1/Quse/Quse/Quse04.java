package Quse;

import java.util.Scanner;

public class Quse04 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
         
    }
}
