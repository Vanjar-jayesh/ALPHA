// print fibonaki
package RecursionBasics;

public class Quse05 {

    public static int fib(int n ){
        if (n==0||n==1) {
            return n;
        }

        int f1 = fib(n-1);
        int f2 =  fib(n-2);
        int fn = f1+f2;
        return fn;
    }
 public static void main(String[] args) {
    
    int n = 5;

    System.out.println(fib(24));
 }   
}
