package for_loops.Quse;

public class quse02 {
    public static void main(String[] args) {
        int n = 10899;

        while (n>0) {
            int lastgit = n %10;
            System.out.print(lastgit);
            n = n/10;
        }
       

    }
}
