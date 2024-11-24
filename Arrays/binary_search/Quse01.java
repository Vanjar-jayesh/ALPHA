package binary_search;

public class Quse01 {
    public static int binarySearch(int number[], int key) {
        int star = 0,end = number.length - 1;

        while (star <= end) {
            int mid = (star + end) / 2;
            // comparisons
            if (number[mid] == key) {
                return mid;
            }

            if (number[mid] < key) {// right
                star = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;

        System.out.println("index for key is :" + binarySearch(number, key));
    }
}
