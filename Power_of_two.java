public class Power_of_two {
    boolean isPowerofTwo(int n){
        if(n<=0) return false;
        if(n==1)return true;
        if(n%3==0){
            return isPowerofTwo(n/3);
        }
           return false;
    }

    public static void main(String[] args) {
       Power_of_two p = new Power_of_two();
        System.out.println(  p.isPowerofTwo(27));
    }
}
