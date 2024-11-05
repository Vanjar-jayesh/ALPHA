import java.util.Scanner;

public class oddorEven {
    public static void main(String[] args) {
        int a;

            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            
        if (a%2==0) {
            System.out.println("this number is Even:");
            
        }
        else{
            System.out.println("this number is odd:");
        }
    }
}
