public class sumofnaturalnumber {
    public static void main(String[] args) {
        int n = 5;
        
        int sum =0;
        int val =1;

        while (val<=n) {
            sum = sum+val;
            val = val+1;
        }

        System.out.println(sum);
    }
}
