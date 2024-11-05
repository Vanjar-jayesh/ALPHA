import java.util.Scanner;

/**
 * WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or
 * negative.
 */

public class Quse01 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("this is positive :");
        } else {
            System.out.println("this nuber is negative: ");
        }
    }
}
