public class PeakElement {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start < end){
            int mid = start +(end-start)/2;
            if (mid==0){
                if(nums[0] >nums[1])
                    return 0;
                else
                    return 1;
            }

            if(mid==nums.length-1){
                if(nums[mid]  >nums[mid-1])
                    return mid;
                else
                    return mid-1;
            }

            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid-1]>nums[mid]){
                end = mid-1;
            }else{
               start = mid +1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        PeakElement pk = new PeakElement();
        int [] arr = {1,2,3,4,2,6};
        int result = pk.findPeakElement(arr);
        System.out.println(result);
    }
}


