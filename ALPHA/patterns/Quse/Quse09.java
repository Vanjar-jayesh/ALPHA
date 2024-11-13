
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// **********
package Quse;
public class Quse09 {

    public static void Hollow_rectangle(int totrows,int totcols){

        for(int i =1; i<=totrows; i++){
            for(int j=1; j<=totcols; j++){
                // cell - (i,j);
                if (i==1||i==totrows||j==1 || j==totcols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_rectangle(7,10);
    }
}
