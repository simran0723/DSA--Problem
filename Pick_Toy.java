import java.util.HashMap;
import java.util.Map;
public class Pick_Toy {
    public static void main(String[] args) {
        Character[] ch = {'a','b','b','c','c','a','b'};
        int i=0,j=0;
        int k =2;
        int max=0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<ch.length){
            if(map.containsKey(ch[j])){
                map.put(ch[j],map.get(ch[j])+1);
            }else{
                map.put(ch[j],1);
            }if(map.size()<k){
                j++;
            }else if(map.size()==k){
                max = Math.max(max,j-i+1);
                j++;
            }else if(map.size()>k){
                while(map.size()>k){
                    if(map.get(ch[i])==1){
                        map.remove(ch[i]);
                    }else {
                        map.put(ch[i], map.get(ch[i]) - 1);
                    }
                    i++;
                }
                j++;
            }
        }if(max==0){
            System.out.println(1);
        }else
            System.out.println(max);

    }
}
