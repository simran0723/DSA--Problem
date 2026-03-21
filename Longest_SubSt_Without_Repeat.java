import java.util.HashMap;
import java.util.Map;
public class Longest_SubSt_Without_Repeat {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i=0,j=0;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

            if(map.size()==j-i+1){
                max = Math.max(max , j-i+1);
                j++;
            }else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    char left = s.charAt(i);
                    if(map.get(left)==1){
                        map.remove(left);
                    }else{
                        map.put(left,map.get(left)-1);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
