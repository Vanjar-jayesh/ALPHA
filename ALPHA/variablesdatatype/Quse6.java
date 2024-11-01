/**
 * Quse6
 */
public class Quse6 {

    public static void main(String[] args) {
        int a = 0;
        int b =1;

        for(int i =0; i<=4; i++){
            int c = a +b;
            a = b;
            b = c;
            System.out.println(c);

        }
      
    }
}