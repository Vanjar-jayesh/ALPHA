package Array2D;

public class strircaseSeach {

    public static boolean strircaseSeach(int matrix[][],int key){
            int row =0,col=matrix[0].length-1;

            while (row<matrix.length&&col>=0) {
                if (matrix[row][col]==key) {
                    System.out.print("found key at ("+row+","+col+")");
                    return true;
                }

                else if (key<matrix[row][col]) {
                    col--;
                }else{
                    row++;
                }
            }
            System.out.println("key not found");
            return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,45},{32,33,39,50}};
        int key = 33;

        strircaseSeach(matrix, key);

    }
}