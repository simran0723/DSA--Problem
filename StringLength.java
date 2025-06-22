import java.io.*;
import java.util.*;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ptr = sc.nextLine();
        int p = str.length();
        int s = ptr.length();
        int sum = p + s;
        System.out.println(sum);
        if (str.compareTo(ptr)<0 || str.compareTo(ptr)==0 ) {
            System.out.println("No");
        }
        else
            System.out.println("Yes");


        String str1 = String.valueOf(str.charAt(0)).toUpperCase().concat(str.substring(1));
        String ptr1 = String.valueOf(ptr.charAt(0)).toUpperCase().concat(ptr.substring(1));
        System.out.println(str1 +" "+ ptr1);

    }
}

