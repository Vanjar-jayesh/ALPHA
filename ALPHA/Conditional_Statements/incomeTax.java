import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        int income;
        int tax;

        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();

        if (income<=500000) {
            tax = 0;
            System.out.println(tax);
        }
        else if (income>= 500000 && income<=1000000) {
            tax = (int)(income * (0.2));
            System.out.println(tax);
        }
        else{
            tax = (int) (income * (0.3));
            System.out.println(tax);
        }
    }
}
