// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1 

package Quse;

public class Quse07 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            for(int j =5; j>=i; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
