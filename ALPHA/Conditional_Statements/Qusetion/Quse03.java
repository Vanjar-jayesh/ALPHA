import java.util.*;
public class Quse03 {
    public static void main(String[] args) {
        int day ; 
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;

                
            case 2:
            System.out.println("thu..");
            break;

            
            case 3:
                System.out.println("wed..");
                break;

                
            case 4:
            System.out.println("thaus...");
            break;

            
            case 5:
                System.out.println("fri..");
                break;
        
                
            case 6:
            System.out.println("satr");
            break;

            
            case 7:
                System.out.println("son..");
                break;
            default:
                System.out.println("invelid days");
                break;
        }

    }
}
