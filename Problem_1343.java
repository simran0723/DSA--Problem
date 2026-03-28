public class Problem_1343 {
    public static void main(String[] args) {
        int [] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        int sum = 0;
        int count = 0;
        int i=0,j=0;
        while(j<arr.length){
            sum = sum + arr[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                if(sum/k >= threshold){
                    count++;
                }
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println(count);
    }
}
