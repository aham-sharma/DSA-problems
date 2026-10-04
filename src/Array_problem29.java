//Print the sum of each row in a 2D array.

import java.util.ArrayList;
import java.util.List;

public class Array_problem29 {

    static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int row=0; row<m;row++){
            int sum = 0;

            for (int column=0; column<n; column++){
                int value = arr[row][column];
                sum = sum + value;
            }
            result.add(sum);
        }

        return result;
    }

    static void main() {
        int[][] arr = {{1,2,5},{4,7,3},{3,6,1}};
        System.out.println(rowSums(arr));
    }

}
