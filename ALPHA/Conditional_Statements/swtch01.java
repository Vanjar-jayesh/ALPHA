
import java.util.Scanner;

public class swtch01 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
            System.out.println("burger");
            break;

            case 3:
            System.out.println("mango shake");
            break;

            case 4:
            System.out.println("we wake up");
            break;

        
            default:
            System.out.println("invelied number: ");
                break;
        }
    }
}
