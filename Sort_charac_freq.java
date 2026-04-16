import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Sort_charac_freq {
    public static void main(String[] args) {
        String s = "tree";
      Map<Character,Integer> map = new HashMap<>();
          for(int i =0;i<s.length();i++){
              char ch = s.charAt(i);
              if(map.containsKey(ch)){
                  map.put(ch, map.get(ch)+1);
              }else {
                  map.put(ch, 1);
              }
          }
        System.out.println(map);
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(char ch : map.keySet()){
            maxheap.add(new int[]{map.get(ch),ch});
        }
        System.out.println(maxheap.p);
        StringBuilder result = new StringBuilder();
          while(!maxheap.isEmpty()){
              int freq = maxheap.peek()[0];
              char element = (char) maxheap.peek()[1];
              for(int i =1;i<=freq;i++){
                 result.append(element);
              }
             maxheap.poll();
          }
        System.out.println(result.toString());
    }
}
