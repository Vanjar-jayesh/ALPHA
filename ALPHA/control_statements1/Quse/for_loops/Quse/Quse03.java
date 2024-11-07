package for_loops.Quse;

public class Quse03 {

    public static void main(String[] args) {
        int n = 10899;
        int rev =0;

        while (n>0) {
            int lst = n%10;
            n = n/10;
            rev = (rev*10)+lst;
        }
        System.out.println(rev);
    }
}