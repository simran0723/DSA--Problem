public class Sqrtx {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int res = -1;
        while(start<=end ){
            int mid = start +(end - start)/2;
            if((long)mid * mid<=x){
                res = mid;
                start = mid +1;
            }else
                end = mid -1;
        }
        return res;
    }

    public static void main(String[] args) {
        Sqrtx q = new Sqrtx();
        int result = q.mySqrt(2147395599);
        System.out.println(result);
    }
}
