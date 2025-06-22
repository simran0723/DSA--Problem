import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        if (str.length() == 0) {
            System.out.println(0);
        }
        else {
            String regex = "[,\\'\\?\\.\\!\\_\\@\s]+";
            String[] tokens = str.split(regex);
            System.out.println(tokens.length);
            for (String s : tokens) {
                System.out.println(s);
            }
            scan.close();
        }
    }
}