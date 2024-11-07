package for_loops.Quse;

import java.util.Scanner;

public class Quse04 {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        do{
            number = sc.nextInt();
            if (number %  10 == 0) {
                break;
            }
            System.out.println(number);
        }while(true);
        
        sc.close();
    }
}