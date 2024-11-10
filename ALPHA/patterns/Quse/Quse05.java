package Quse;

public class Quse05 {
    public static void main(String[] args) {
        int n=4; 

        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if (i-j<=0) {
                    System.out.print("*");
                }
                //else{
                 //   System.out.println(" ");
               // }
            }
            System.out.println();
        }
    }
}
