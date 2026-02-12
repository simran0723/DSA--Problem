public class Min_Difference {
    public static int mindifference(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        if (key < arr[start]) {
            return Math.abs(arr[start] - key);
        }
        if (key > arr[end]) {
            return Math.abs(arr[end] - key);
        }
        while (start <= end) {
          int mid = start +(end - start)/2;
          if(arr[mid]==key){
              return 0;
          }else if (key>arr[mid]){
              start = mid+1;
          }else{
              end = mid-1;
          }
        }
        return Math.min(Math.abs(arr[start]-key),Math.abs(arr[end]-key));
    }
        public static void main (String[]args){
           int [] arr = {1,3,8,10,15};
           int key = 11;
            System.out.println(mindifference(arr,key));
        }
    }

