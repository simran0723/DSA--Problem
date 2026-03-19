import java.util.Map;
import java.util.HashMap;
public class Longest_Substring_unique {
    public static void main(String[] args) {
        String s = "aaabb";
        int k =3;
        int i=0,j=0;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        while(j< s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            if(map.size()<k){
                j++;
            }else if(map.size()==k){
                max = Math.max(max,j-i+1);
                j++;
            }else if(map.size()>k){
                while(map.size()>k){
                    char leftchar = s.charAt(i);
                    if(map.get(leftchar)==1){
                        map.remove(leftchar);
                    }else{
                        map.put(leftchar,map.get(leftchar)-1);
                    }
                    i++;
                }
                j++;
            }
        }if(max==0) {
            System.out.println(-1);
        }else
            System.out.println(max);
    }
}
