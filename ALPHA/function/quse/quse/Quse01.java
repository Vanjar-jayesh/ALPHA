package quse;

public class Quse01 {
    // public static boolean prime(int n){
    //         boolean isprime = true;
    //     for(int i=2;i<=n-1; i++){
    //         if (n%i==0) {
    //             isprime = false;
            
    //         }


    //     }
    //     return isprime;
    // }
/*
 * this method is optimized isprime number ;
 */
    public static boolean isprime(int n){
        if (n==2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) {
                return false;
            }

        }
        return true;
    }

    public static void primeRang(int n){

        for(int i=2; i<=n; i++){
            if (isprime(i)) {
                System.out.println(i+" ");
                
            }
          //  System.out.println( );
        }
    }
    public static void main(String[] args) {
        int n=10;

      primeRang(n);
    }
}
