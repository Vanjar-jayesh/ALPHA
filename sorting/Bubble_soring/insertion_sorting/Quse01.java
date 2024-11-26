package insertion_sorting;

import java.lang.classfile.instruction.ConstantInstruction.IntrinsicConstantInstruction;
import java.util.Arrays;
import java.util.Collections;

public class Quse01 {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the insertion sort
            while (prev >= 0 && arr[prev] > curr) {// chaing the condation for disgting ordar
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev + 1] = curr;

        }
    }

    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // selectionSort(arr);
        // insertionSort(arr);
  

        Arrays.sort(arr,0,3, Collections.reverseOrder());
        printarr(arr);
    }
}
