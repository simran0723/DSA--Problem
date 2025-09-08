import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

      // Scanner sc=new Scanner(System.in);
        //String A=sc.next();
//        int len = A.length();
//        System.out.println(len);
//        String reversedStr = "";
//        for (int i = 0; i < A.length(); i++) {
//            reversedStr = A.charAt(i) + reversedStr;
//        }
//         System.out.println(reversedStr);
//        if(reversedStr.equals(A)){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        String str=sc.nextLine();
//        char[]c = str.toCharArray();
//        for (int i = 1; i <=str.length() ; i++) {
//            System.out.print(" " + Arrays.toString(c));
//        }
//
////        String reversedStr = "";
////        for (int i = 0; i < str.length(); i++) {
////            reversedStr = str.charAt(i) + reversedStr;
////        }
        //Another method with less time complexity

//        StringBuilder rev = new StringBuilder();
//        for(int i=s.length()-1;i>=0;i--){
//            rev.append(s.charAt(i));
//        }
//        return rev.toString().equals(s);
public boolean isPalindrome(String s) {
        String result = s.replaceAll("[,\\'\\?\\.\\!\\:\\_\\@\s]+", "").toLowerCase();
        System.out.println(result);
        String rev = "";
        if(s==null){
            return true;
        }
            for(int i= result.length()-1;i>=0;i--) {
                rev += result.charAt(i);
                System.out.println(rev);
            }
            if (rev.compareTo(result)==0){
                return true;
            }
                return false;
        }


    public static void main(String[] args) {
        StringReverse t = new  StringReverse();
 Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
     t.isPalindrome(A);
    }
}