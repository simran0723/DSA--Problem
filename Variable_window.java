public class Variable_window {
    public static void main(String[] args) {
        int [] arr  ={-5,8,-14,2,4,12};
        int k =-5;
        int i =0,j=0;
        long sum =0;
        int max =0;
        while(j<arr.length){
            sum = sum +arr[j];
            if(sum< k){
                j++;
            }
            if(sum == k){
                max = Math.max(max,j-i+1);
                j++;
            }else if (sum >k){
                while(sum>k){
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
