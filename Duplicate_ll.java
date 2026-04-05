import java.util.HashSet;
import java.util.Set;
public class Duplicate_ll {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3};
        int k =2;
        Set<Integer> set = new HashSet<>();
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(set.contains(arr[j])){
                System.out.println(true);
            }
            set.add(arr[j]);
            if(set.size()>k){
                set.remove(arr[i]);
                i++;
            }
        }
        System.out.println(false);
    }
}
