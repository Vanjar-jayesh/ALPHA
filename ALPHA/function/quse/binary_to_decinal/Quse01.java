package binary_to_decinal;

public class Quse01 {
    public static void binToDec(int binnum){
        int mynumber = binnum;
        int pow = 0;
        int decnum=0;

        while (binnum>0) {
            int ld = binnum%10;

            decnum = decnum+(ld*(int)Math.pow(2, pow));
            pow++;
            binnum= binnum/10;

        }
        System.out.println("decimal of "+mynumber +": "+decnum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
