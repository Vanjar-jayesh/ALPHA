package psQuse;

import java.lang.reflect.Array;

public class Quse02 {

    public static void reve(int arr[]){

        int n = arr.length;
        int temp[] = new int[n];
        for(int i = 0; i<n; i++){
                temp[i] = arr[n-i-1];

        }

        for(int i = 0 ; i<n; i++){
            // temp[i] = arr[i];

            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6,5};

        reve(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
