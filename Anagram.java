import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
   public static boolean isAnagram(String a, String b) {
       String str1 = a.toUpperCase();
       String str2 = b.toUpperCase();
        int []arr= new int[26];
        for(int i =0;i<str1.length();i++){
            arr[str1.charAt(i)-'A']++;
        }
        int[]brr = new int[26];
        for (int i=0;i<str2.length();i++){
            brr[str2.charAt(i)-'A']++;
        }
        // first method . only applicable if import java .util.Arrays is present

//        if(Arrays.equals(arr,brr)) return true;
//        else return false;

       // universal method use : if first method is not applicalbe
       for (int i = 0; i <26 ; i++) {
           if (arr[i]!=brr[i])
               return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String a = sc.nextLine();
        System.out.println("Enter Second String: ");
        String b = sc.nextLine();
        boolean ans = isAnagram(a,b);
        if(ans==true)
            System.out.println("Its an angram");
        else
           System.out.println("Not an anagram");
    }
}
