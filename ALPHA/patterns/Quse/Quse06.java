package Quse;

public class Quse06 {
    public static void main(String[] args) {
        int n =4;
         
        for(int i=1; i<=n; i++){
            int val=1;
            for(int j =1; j<=n; j++){
                if (i-j>=0) {
                    System.out.print(val);
                    val++;
                }
            }
           System.out.println();
        }
    }
}
