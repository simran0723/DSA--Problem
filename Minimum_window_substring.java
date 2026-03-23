import java.util.HashMap;
import java.util.Map;
public class Minimum_window_substring {
    public static void main(String[] args) {
        String s = "TOTMTAPTAT";
        String t = "TTA";
        int i =0;
        int j =0;

        Map<Character,Integer> map = new HashMap<>();
        for(int k =0;k<t.length();k++){
            if(map.containsKey(t.charAt(k))){
                map.put(t.charAt(k),map.get(t.charAt(k))+1);
            }else{
                map.put(t.charAt(k),1);
            }
        }
        int count = t.length();
        int minlen  = Integer.MAX_VALUE;
        int start = i;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)>0)count--;
                map.put(ch,map.get(ch)-1);
            }

            while(count==0){
                if(j-i+1<minlen){
                    minlen = j-i+1;
                    start = i;
                }
                char leftchar = s.charAt(i);
                if(map.containsKey(leftchar)) {
                    map.put(leftchar, map.get(leftchar) + 1);
                    if (map.get(leftchar) > 0)
                        count++;
                }
                i++;
            }
             j++;
        }
        if(minlen==Integer.MAX_VALUE){
            System.out.println("");
        }else
            System.out.println(s.substring(start,start+minlen));

        }
}

