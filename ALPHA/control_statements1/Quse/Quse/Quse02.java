package Quse;

import java.util.Scanner;

public class Quse02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum =0;
        int oddsum =0;

        do{
            System.out.println("enter the number");
            number = sc.nextInt();

            if (number%2==0) {
                evensum += number;
            }else{
                oddsum+=number;
            }
            System.out.println("Do you want to continue ? press 1 for yes or 0 for no");

            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("sum of even numbers:"+evensum);
        System.out.println("sum of ood numbers:"+oddsum);
    }
}
