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
        System.out.printf("positive sum : %d \n", posivitesum);
        System.out.printf("negative sum : %d", negativesum);
    }

    static void main() {

        int[] arr = {2,-3,-5,-7,9};
        sumofNegPos(arr);

    }

}
