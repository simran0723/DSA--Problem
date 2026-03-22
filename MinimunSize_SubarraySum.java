public class MinimunSize_SubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int k = 7;
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        
        int sum = 0;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;
            } else {
                while (sum >= k) {
                    min = Math.min(min, j - i + 1);
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}
