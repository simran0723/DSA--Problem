import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int n = sc.nextInt();
        System.out.println("put the value of elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int target = sc.nextInt();
        int start =0;
        int end = n-1;
        int res = -1;
        while(start <= end ){
            int mid = start +(end-start)/2;
            if(arr[mid]== target){
                res= mid;
                //start = mid+1;// for last occurance use this.
                end = mid-1;// for first occurance uncomment this.
            }else
              // end = mid-1; //// for last occurance use this.
                start = mid+1;// for first occurance uncomment this.

        }
        System.out.println(res);
    }
}
