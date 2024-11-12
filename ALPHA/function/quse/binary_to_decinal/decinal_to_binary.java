package binary_to_decinal;

public class decinal_to_binary {
    public static void decTobin(int n){
        int mynumber = n;
        int pow = 0; 
        int binnum = 0;

        while (n>0) {
            int ren = n%2;
            binnum = binnum + (ren*(int)Math.pow(10, pow));
            pow++;
            n= n/2;
        }
        System.out.println("decimal of "+mynumber +": "+binnum);

    }
    public static void main(String[] args) {
       decTobin(12);
    }
}
