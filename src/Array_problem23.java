//find four numbers in array that adds up to be the target
import java.util.Arrays;

public class Array_problem23 {

    static int[] fourSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    for (int l = k + 1; l < nums.length; l++) {

                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            return new int[]{i, j, k, l};
                        }

                    }
                }
            }
        }

        return new int[]{};
    }

    static void main() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 10;

        System.out.println(Arrays.toString(fourSum(arr, target)));
    }
}