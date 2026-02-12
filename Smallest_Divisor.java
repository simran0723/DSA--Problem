public class Smallest_Divisor {
    public static void main(String[] args) {
        int [] arr = {1,2,5,9};
        int threshold = 6;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
          int start = 1;
          int end = max;
          int res =-1;
          while(start<=end){
              int mid = start +(end -start)/2;
              if(sumByD (arr,mid)<=threshold){
                  res = mid;
                  end = mid-1;
              }else
                  start = mid+1;
          }
        System.out.println(res);
    }
    private static int sumByD (int[] arr,int div){
            int sum =0;
            for(int i = 0;i<arr.length;i++){
                sum = sum+ (int) Math.ceil((double) arr[i]/div);
            }
            return sum;
    }
}
