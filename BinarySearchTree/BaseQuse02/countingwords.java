package BaseQuse02;

public class countingwords {

    public static int prefixSount(String[] words,String pref){
        int n = pref.length();
        int count = 0;

        for(String W : words){
            if (W.length() >= n && W.startsWith(pref)) {
                count++;
            }
        }

        return  count;
        
    }

    public static void main(String[] args) {
        String [] words = {"pay","attention","attention"};
        String pref = "at";

        System.out.println(prefixSount(words, pref));
    }
}
