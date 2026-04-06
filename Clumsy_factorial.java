public class Clumsy_factorial {
    public int clumsyfactorial(int n){
        long ans = 0;
        int sign = 1;
        for(int i =n;i>0;i-=4){
            int temp =i;
            if(i-1>0) temp *= i-1;
            if(i-2>0)temp/=i-2;
            ans += temp*sign;
            if(i-3 >0)ans += i-3;
            sign = -1;
        }
        return (int )ans;
    }
    public static void main(String[] args) {
        Clumsy_factorial cf = new Clumsy_factorial();
        System.out.println(cf.clumsyfactorial(10));
    }
}
