public class Array_problem26 {

    static int pivotIndex(int[] nums) {

        int n = nums.length;
        int Leftsum[] = new int[n];
        int Rightsum[] = new int[n];

        Leftsum[0] = 0;
        for (int i = 1; i < n; i++) {
            Leftsum[i] = Leftsum[i - 1] + nums[i-1];
        }
        Rightsum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            Rightsum[i] = Rightsum[i + 1] + nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            if (Leftsum[i] == Rightsum[i]) {
                return i;
            }
        }
    return -1;
    }

    static void main() {
        int[] arr = {-1, -1, 0, 1, 1, 0};
        System.out.println(pivotIndex(arr));
    }

}
