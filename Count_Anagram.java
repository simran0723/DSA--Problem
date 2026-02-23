import java.util.ArrayList;

public class Count_Anagram {
    public static int search (String txt , String pat){
        int k = 3;
         int n  = txt.length();
        int [] counter = new int[26];
        // to count the frequency of the letters of the pat string
        for(int i = 0;i< pat.length();i++){
               char ch = pat.charAt(i);
               counter[ch -'a']++;
        }
        int i = 0;
        int j = 0;
        int result =0;
        while(j<n){
            counter[txt.charAt(j) -'a']--;  // agar koi element mil gaya to uski frequency decrease kar denge
            if(j-i+1 == k ){       // window size check
                if(allZero(counter)){
                    result ++;      // agar sare letters ke frequency zero ho to result me plus kar denge
                }
                counter[txt.charAt(i) - 'a']++;    // jo letter window ke bahar gaya to uski freq. increase kar dneg
                i++;
            }
            j++;
    }
                 return result;
    }

       static boolean allZero (int[] counter){
            for (int i : counter) {
                if (i != 0) {         //  agar frequency 0 nahi hui to wo anagram nahi hai
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println(search("forxxorfxdofr","for"));


    }
}
