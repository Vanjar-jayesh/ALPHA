package Array2D;

public class Spriralmatrix {
    public static void printmartix(int matrices[][]) {
        int stRow = 0;
        int stCol = 0;
        int endRow = matrices.length - 1;
        int endCol = matrices[0].length - 1;

        while (stRow <= endRow && stCol <= endCol) {
            // top

            for (int j = stCol; j <= endCol; j++) {
                System.out.print(matrices[stRow][j] + " ");
            }
            // right
            for (int i = stRow + 1; i <= endRow; i++) {
                System.out.print(matrices[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= stCol; j--) {
                if (stRow == endRow) {
                    break;
                }

                System.out.print(matrices[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= stRow + 1; i--) {
                if (stCol == endCol) {
                    break;
                }
                System.out.print(matrices[i][stCol] + " ");
            }

            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrices[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printmartix(matrices);
    }
}
