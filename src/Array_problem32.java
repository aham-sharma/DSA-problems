import java.util.Arrays;

//Transpose of a matrix
//
public class Array_problem32 {

    static int[][] transpose(int[][] matrix){
        if (matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int newTotalRows = totalCols;
        int newTotalcols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalcols];

        for (int i=0; i<totalRows; i++){
            for (int j=0;j<totalCols;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    static void main() {
        int[][] matrix = {{3,5,2},{2,1,6},{7,1,4}};
        int[][] arr = transpose(matrix);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
