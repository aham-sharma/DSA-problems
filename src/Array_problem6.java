public class Array_problem6 {

    static int[] count_zero_ones(int[] arr){

        int zeroCount = 0;
        int oneCount = 0;

        for (int i : arr){
            if(i == 0){
                zeroCount++;
            }
            if(i == 1){
                oneCount++;
            }
        }

        int[] CountArr = {zeroCount,oneCount};

        return CountArr;
    }

    static void main() {

        int[] arr = {0,0,1,1,0,1,1,0,1,0,0};
        int[] CountArr = count_zero_ones(arr);
        System.out.printf("zerosCount : %d \nonesCount : %d",CountArr[0],CountArr[1]);
    }
}
