//find the mode of an array

import java.util.HashMap;

public class Array_problem14 {

    static int getmode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxfreq = -1;
        int maxfreqkey = -1;
        for (int key : freq.keySet()) {
            int CurrentKey = key;
            int Currentkeyfreq = freq.get(key);
            if (Currentkeyfreq > maxfreq) {
                maxfreq = Currentkeyfreq;
                maxfreqkey = CurrentKey;
            }
        }
        return maxfreqkey;
    }


    static void main() {
        int[] arr = {1,2,2,3,3,4,4,4,4,4,4,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7};
        int ans = getmode(arr);
        System.out.println(ans);
    }

}
