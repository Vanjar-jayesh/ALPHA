
//    *
//   **
//  ***
// ****
package Quse;
public class Quse10 {
    public static void inver(int n){
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
            inver(4);
   }   
}
