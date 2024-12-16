import java.util.Arrays;

public class Quse05 {

    public static boolean cont(int arr[]){

       
        for(int i = 1 ; i<arr.length; i++){

            if (arr[i] == arr[i-1]) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Arrays.sort(arr);
        System.out.println(cont(arr));

    }
}
