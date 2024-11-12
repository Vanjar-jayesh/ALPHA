package Quse01;

import java.util.Scanner;

public class Quse02 {
    public static boolean IsEven(int n) {

        boolean iseven = false;

        if (n%2==0){
            iseven = true;
        }
        return iseven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (IsEven(n)) {
            System.out.println("this number is Even:");
        }
        else{
            System.out.println("this number is odd :");
        }
        
    }

}
