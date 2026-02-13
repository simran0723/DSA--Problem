public class shipping {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int day = 5;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max= arr[i];
        }
         int sum =0;
        for(int i = 0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        int start = max;
        int end = sum;
        int res = -1;
        while(start<= end ){
            int mid = start +(end - start)/2;
            if(isPossible(arr,mid)<=day){
                res = mid;
                end = mid-1;
            }else
                start = mid +1;
        }
        System.out.println(res);
    }
    private static int isPossible(int[]arr,int capacity){
        int day =1;
        int load =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+load > capacity){
                day++;
                load = arr[i];
            }else
                load = load + arr[i];
        }
        return day;
    }
}
