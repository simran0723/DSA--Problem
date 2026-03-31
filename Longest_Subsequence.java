import java.util.Arrays;
import  java.util.HashSet;
import java.util.Set;

public class Longest_Subsequence {

    public static int LongestConsecutive(int [] arr){
       Set<Integer> st = new HashSet<>();
        int res =0;
        for(int val : arr){
            st.add(val);
        }
        for(int val : arr){
            if(st.contains(val)&& !st.contains(val -1)){
                int curr = val ;
                int count = 0;
                while(st.contains(curr)){
                    curr++;
                    count++;
                }
                res = Math.max(count,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
     int [] arr ={2,6,1,9,4,5,3};
        System.out.println(LongestConsecutive(arr));
    }
}
