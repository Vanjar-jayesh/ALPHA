

package quse;

public class findproduct {
    public static int product(int a,int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        int a = 3;
        int b=5;
        int  ans = product(a, b);
        System.out.println(ans);
    }
}
