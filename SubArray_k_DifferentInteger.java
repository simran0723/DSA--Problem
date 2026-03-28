import java.util.HashMap;
import java.util.Map;

public class SubArray_k_DifferentInteger {
    public  static int subarrayWithKdiff (int [] arr , int k){
       // int [] arr = {1,2,1,2,3};
        //int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        int i=0,j=0;
        int count =0;
        while(j<arr.length){
            if(map.containsKey(arr[j])){
                map.put(arr[j], map.get(arr[j])+1);
            }else{
                map.put(arr[j],1);
            }

             while (map.size() > k ){
                map.put(arr[i] , map.get(arr[i])-1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }
                i++;
            }
            count = count + (j-i+1);
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
     int [] arr = {1,2,1,2,3};
     int k = 2;
     int ans = subarrayWithKdiff(arr,k) - subarrayWithKdiff(arr,k-1);
        System.out.println(ans);
    }
}
