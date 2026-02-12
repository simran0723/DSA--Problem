public class kth_missing {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int k = 2;
        int start =0;
        int end = arr.length-1;
        while(start<= end ){
            int mid = start + (end - start)/2;
            int missing = arr[mid]-mid -1;
            if(missing<k){
                start = mid +1;
            }else
                end = mid-1;
        }
        System.out.println(start+k);
    }
}
