//Wave print a Matrix.
//

import java.util.ArrayList;
import java.util.List;

public class Array_problem31 {

    static List<Integer> wavePrintMatrix(int[][] matrix, int m ,int n){

        List<Integer> result = new ArrayList<>();
            for (int col=0; col<n;col++){
                if((col & 1) == 1){
                    for (int row=m-1;row>=0;row--){
                        result.add(matrix[row][col]);
                    }
                }
                else{
                    for(int row = 0; row<n; row++){
                        result.add(matrix[row][col]);
                    }
                }
            }
        return result;
    }

    static void main() {
        int[][] arr = {{1,3,5},{4,2,6},{7,2,1}};
        int n = 3;
        int m = 3;
        System.out.println(wavePrintMatrix(arr,n,m));
    }

}
