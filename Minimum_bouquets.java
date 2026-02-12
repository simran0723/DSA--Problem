public class Minimum_bouquets {
    public static void main(String[] args) {
        int [] arr = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int start = min;
        int end = max;
        int res =-1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(BouquetsPossible( arr, m, k,mid) >= m){
                res = mid;
                end = mid-1;
            }else
                start = mid +1;
        }
        System.out.println(res);
    }

    private static int  BouquetsPossible(int []arr,int m,int k,int mid) {
              int bouqCount = 0;
              int consecutive_count =0;
              for(int i=0;i<arr.length;i++){
                  if(arr[i]<=mid){
                      consecutive_count ++;
                  }else
                      consecutive_count=0;
                  if(consecutive_count == k){
                      bouqCount++;
                      consecutive_count =0;
                  }
              }
              return bouqCount;
    }

}
