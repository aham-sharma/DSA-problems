//find missing number

public class Array_problem19 {

    static int missingnum(int[] arr,int num){
        int arrsum = 0;
        for (int value:arr){
            arrsum += value;
        }
        int sum = 0;
        for (int i = 0; i<=num; i++){
            sum += i;
        }
        int Mnum = sum - arrsum;

        return Mnum;
    }

    static void main() {
        int num = 5;
        int[] arr = {0,1,2,3,5};
        System.out.println(missingnum(arr,num));
    }

}
