package psQuse;

public class Quse03 {

    public static int minmun(int arr[],int N){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }

       return min;
    }

    public static int max(int arr[],int N){
            int max = Integer.MIN_VALUE;

            for(int i = 0; i<N; i++){
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
    }
    public static void main(String[] args) {
        int arr[] = { 3,5,4,1,9};

        int n  = arr.length;
        System.out.println("min"+minmun(arr,n));
        System.out.println("max"+max(arr,n));
       
    }
}
