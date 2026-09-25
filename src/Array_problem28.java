//Kadene's Algorithm

public class Array_problem28 {

    static int maxSubArray(int[] arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    static void main() {

        int[] arr = {1,-2,4,6,-8,9};
        System.out.println(maxSubArray(arr));

    }

}
