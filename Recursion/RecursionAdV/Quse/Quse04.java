package RecursionAdV.Quse;

public class Quse04 {
    public static void printbinStrings(int n, int lastplace, String str) {
        // if (lastplace == 0) {
        //     printbinStrings(n - 1, 0, str.append("0"));
        //     printbinStrings(n - 1, 1, str.append("1"));
        // } else {
        //     printbinStrings(n - 1, 0, str.append("0"));
        // }

        if (n==0) {
            System.out.println(str);
            return;
        }

        printbinStrings(n - 1, 0, str+"0");
        if (lastplace == 0) {
            printbinStrings(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        printbinStrings(3, 0, "");
    }
}
