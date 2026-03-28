import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class Repeated_DNA {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAA";
        int k =10;
        int i=0,j=0;
        Map<String , Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        while(j<s.length()){
          String sub = s.substring(i,j+1);
          if(map.containsKey(sub)){
              map.put(sub,map.get(sub)+1);
          }else{
              map.put(sub,1);
          }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(map.get(sub)==2){
                    result.add(sub);
                }
                i++;
                j++;
            }
        }
        System.out.println(result);
    }
}
