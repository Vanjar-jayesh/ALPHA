package for_loops.Quse;

import java.util.Scanner;

public class Quse05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter the number:");
            int n = sc.nextInt();

            if (n%10==0) {
                continue;                
            }
            System.out.println("number was:"+n);
        }while(true);
    }
}
