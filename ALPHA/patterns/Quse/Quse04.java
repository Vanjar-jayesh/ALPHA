// A
// BC
// DEF
// GHIJ
package Quse;

public class Quse04 {
    public static void main(String[] args) {
        int n=4;
        char ch ='A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
