package Quse01;

import java.util.Scanner;

public class Quse01 {
    public static void Averg(int a, int b, int c) {

        int total = a + b + c;
        double Aver = total / 03;
        System.out.println(Aver);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Averg(a, b, c); 
    }
}
