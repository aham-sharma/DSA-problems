//find the unique number

public class Array_problem20 {

    static int uniqueNum(int[] nums){
        int xor = 0;
        for(int n : nums){
            xor = xor ^ n;
        }
        return xor;
    }

    static void main() {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6};
        System.out.println(uniqueNum(arr));
    }

}
