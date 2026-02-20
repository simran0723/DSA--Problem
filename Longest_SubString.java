import java.util.HashSet;

public class Longest_SubString {
  public static void main(String[]arg){
      HashSet<Character> hs = new HashSet<>();
      String s =  "abcabcbb";
      int i = 0;
      int maxlength = 0;

      for(int j =0 ;j< s.length();j++){
          while(hs.contains(s.charAt(j))){
             hs.remove(s.charAt(i));
             i++;
          }
              hs.add( s.charAt(j));
              maxlength = Math.max(maxlength,j-i+1);
      }
      System.out.println(maxlength);
  }

    }

