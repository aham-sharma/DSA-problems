//Rotate image.
//

import java.util.Vector;

public class Array_problem33 {

    static void rotate90Clockwise(int[][]matrix, int N) {

        // Step 1: Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse all rows
        for (int row = 0; row < N; row++) {

            int startCol = 0;
            int endCol = N - 1;

            while (startCol <= endCol) {

                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

    }


    static void main() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int N = matrix.length;

        rotate90Clockwise(matrix, N);

        // Print rotated matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
