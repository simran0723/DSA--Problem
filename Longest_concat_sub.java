import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Longest_concat_sub {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        List<Integer> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
                list.add("foo");
                list.add("bar");
        //System.out.println(list);
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i< list.size();i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }else{
                map.put(list.get(i),1);
            }
        }
        //System.out.println(map);

        int wordlen = list.get(0).length();
        int totalLen = wordlen* list.size();
        for(int i =0;i<=s.length()-totalLen;i++){
            Map<String,Integer> seen = new HashMap<>();
            int j =0;
            while(j< list.size()){
                int start = i + j*wordlen;
                String word = s.substring(start,start+wordlen);
                if(!map.containsKey(word)){
                    break;
                }if(seen.containsKey(word)){
                    seen.put(word, seen.get(word) + 1);
                }else{
                    seen.put(word, 1);
                }
                if(seen.get(word)>map.get(word)){
                    break;
                }
                j++;
                }

            if(j== list.size()){
                ans.add(i);
            }
            }
        System.out.println(ans);
        }
    }

