import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedStr = "";
        for (int i = 0; i < A.length(); i++) {
            reversedStr = A.charAt(i) + reversedStr;
        }
         System.out.println(reversedStr);
        if(reversedStr.equals(A)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
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
    }
}