


package quse;

public class fact {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomialcoefficient(int n,int r){
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n-r);

        System.out.println(nfact);
        System.out.println(rfact);
        System.out.println(nrfact);

        int bc = nfact/(rfact*nrfact);
        return bc;
    }
    public static void main(String[] args) {
        int n = 10;
        int r = 2;

        int bc = binomialcoefficient(n, r);
        System.out.println(bc);

    }
}
