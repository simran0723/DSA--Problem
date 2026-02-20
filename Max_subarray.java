public class Max_subarray {
    public static void main(String[] args) {
        int [] arr = {5,4,-1,7,8};
        int maxsum = arr[0];
        int currsum = arr[0];
        for(int i = 1; i<arr.length ;i++){
            if(arr[i]> currsum + arr[i]){
                currsum = arr[i];
            }else
                currsum = currsum+arr[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
        }
        System.out.println(maxsum);
    }
}
