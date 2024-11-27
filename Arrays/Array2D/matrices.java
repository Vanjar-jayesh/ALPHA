package Array2D;

import java.util.Scanner;

public class matrices {
    public static boolean search(int matrices[][], int key) {// search fonaction

        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[0].length; j++) {
                if (matrices[i][j] == key) {
                    System.out.print("found at cell(" + i + "," + j + ")");
                    return true;
                }

            }

        }
        System.out.println("not found: ");
        return false;
    }

    public static void main(String[] args) {
        int matrices[][] = new int[3][3];
        int n = matrices.length, m = matrices[0].length;
        Scanner sc = new Scanner(System.in);
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrices[i][j] = sc.nextInt();

            }

        }
        // System.out.println();

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrices[i][j] + " ");

            }
            System.out.println();
        }

        search(matrices, 5);

    }
}
