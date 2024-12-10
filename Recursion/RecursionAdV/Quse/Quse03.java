package RecursionAdV.Quse;

public class Quse03 {

    public static int friendspariring(int n){
        if (n==1||n==2) {
            return n;
        }

        // int fnm1 = friendspariring(n-1);

        // int fnm2 = friendspariring(n-2);

        // int pairways = (n-1) * fnm2;

        // int totways = fnm1 + pairways;

        return friendspariring(n-1) + (n-1) * friendspariring(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendspariring(3));
    }
}
