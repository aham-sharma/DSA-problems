// Soring an array of 0's and 1's


import java.util.Arrays;

public class Array_problem17 {

    static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                {
                    int temp;
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }


        }
        return arr;
    }

        public static void main () {
            int[] arr = {1, 0, 1, 0, 1, 0};

            int[] result = sort(arr);
            System.out.println(Arrays.toString(result));
        }

    }
