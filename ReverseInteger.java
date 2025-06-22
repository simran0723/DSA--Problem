import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }
        int ans = 0;
        while(x > 0){
            int dig = x % 10;
            x = x / 10;
            if(ans>Integer.MAX_VALUE/10 )
                return 0;
            if(ans<Integer.MIN_VALUE/10 )
             return 0;
            ans = ans*10+dig;
        }
        return isNegative ? -ans : ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println(ans);
    }
}
       // simple quetsion ke liye
//int revnum = 0;
//        while(n>0){
//int ld = n%10;
//revnum= (revnum*10)+ld;
//n = n/10;
//        }
//        return revnum;