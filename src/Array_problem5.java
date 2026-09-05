public class Array_problem5 {

    static void sumofNegPos(int[] arr){

        int posivitesum = 0;
        int negativesum = 0;

        for (int i : arr){
            if(i>0){
                posivitesum += i;
            }
            else{
                negativesum += i;
            }
        }
        System.out.printf("the sum of the positive numbers in the array are %d and the sum of the negative numbers in the array are %d", posivitesum,negativesum);

    }

    static void main() {

        int[] arr = {3,5,3,4,-2,-5,-9,9};
        sumofNegPos(arr);

    }

}
