package RecursionBasics;

public class Quse10 {

    public static int optimizedPower(int x,int n){
        if (n==0) {
            return 1;
        }

        int halfpowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        // n is odd
        if (n%2 != 0) {
            halfpowerSq = x *halfpowerSq;
        }

        return halfpowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n =5;

        System.out.println(optimizedPower(x, n) );
    }
}
