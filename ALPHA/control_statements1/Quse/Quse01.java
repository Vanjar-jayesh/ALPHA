package Quse;

import java.util.Scanner;

public class Quse01 {

    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        // while (number<=5) {
        // if (number %2 == 0) {
        // System.out.println(number+"This number is a prime number");
        // }
        // else{
        // System.out.println(number+"this number is not a prime number:");
        // }
        // number++;
        // }
        if (number == 2) {
            System.out.println("number is prime");

        } else {
            boolean isPrime = true;

            for (int i = 2; i <=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(number + "This number is a prime number");
            } else {
                System.out.println(number + "This number is a  not prime number");
            }
        }
    }
}