import java.util.Arrays;
import java.util.HashMap;

public class Array_problem15 {

    static int[] high_lowfreq(int [] arr){

        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] ans = new int[2];
         for(int num: arr){
             freq.put(num ,freq.getOrDefault(num , 0) + 1);
         }
         int maxfreq = -1;
         int maxfreqkey = -1;
         for (int key:freq.keySet()){
            int Currentkey = key;
            int Currentkeyfreq = freq.get(key);
            if(Currentkeyfreq>maxfreq){
                maxfreq = Currentkeyfreq;
                maxfreqkey = Currentkey;
            }
         }
    ans[0] = maxfreqkey;
         int lowfreq = Integer.MAX_VALUE;;
         int lowfreqkey = -1;
         for (int key: freq.keySet()){
             int Currentkey = key;
             int Currentkeyfreq = freq.get(key);
             if(Currentkeyfreq < lowfreq){
                 lowfreq = Currentkeyfreq;
                 lowfreqkey = Currentkey;
             }
         }
         ans[1] = lowfreqkey;
         return ans;
    }

    static void main() {
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,4,4,4,5,6,6,6,7,7,7,7,7,7,7,7,7,7,7,8,8};
        System.out.println(Arrays.toString(high_lowfreq(arr)));
    }

}
