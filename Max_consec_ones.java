public class Max_consec_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int i =0,j=0;
        int zerocount =0;
        int maxlen = 0;
        while(j<arr.length){
            if(arr[j]==0){
                zerocount++;
            }
            while(zerocount >k){
                if(arr[i]==0){
                    zerocount--;
                }
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        System.out.println(maxlen);
    }
}
