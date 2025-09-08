import java.util.Scanner;

public class Reverse_String {
    public static String reverseString(String s) {
        //String str = "Geeks";
        if (s == null) return null;
        String rev = "";
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     reverseString(s);
        System.out.println(reverseString(s));
    }
}
