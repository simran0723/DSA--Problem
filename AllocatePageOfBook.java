public class AllocatePageOfBook {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int start = max;
        int end = sum;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(arr, arr.length, k, mid) == true) {
                res = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        System.out.println(res);
    }

    public static boolean isValid(int[]brr,int n,int k,int mid){
        int std =1;
        int sum1 = 0;
        for(int i=0;i<brr.length;i++){
            sum1= sum1+brr[i];
            if(sum1>mid){
                std++;
                sum1 = brr[i];
            }
            if(std >k){
                return false;
            }
        }
        return true;
    }
}
