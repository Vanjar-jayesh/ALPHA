package string;

public class Quse03 {

    public static String suString(String str,int si,int ei){
        String substr = "";

        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args) {
        String str = "Helloworld";

        System.out.println(str.substring(0,5));

        // System.out.println(suString(str, 4, 7));
    }
}
