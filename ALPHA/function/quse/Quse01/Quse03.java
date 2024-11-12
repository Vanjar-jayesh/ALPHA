package Quse01;

import java.util.Scanner;

public class Quse03 {

    public static boolean Palindrome(int number){
        int Palindrome = number;
        int rev = 0; 

        while (Palindrome !=0) {
                int remd = Palindrome %10;
                rev = rev*10+remd;
                Palindrome = Palindrome/10;
        }

        if (number == rev) {
            return true;
        }
        return false;

        
    }
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner  sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (Palindrome(number)) {
            System.out.println("this number is palindrome");
        }
        else{
            System.out.println("this number not a palindrom");
        }


    }
}