package variablesdatatype;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float red = sc.nextFloat();

        float area = 3.14f *red *red;
        System.out.println(area);
    }
}
