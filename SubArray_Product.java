public class SubArray_Product {
    public static void main(String[] args) {
        int [] arr = {10,5,2,6};
        int k = 100;
        int i=0;
        int j=0;
        int prod = 1;
        int count =0;
        while(j<arr.length){
           prod = prod* arr[j];
           while(prod >=k&& i<= j){
               prod = prod/arr[i];
               i++;
               System.out.println(" the prod " + prod);
           }
           count = count + (j-i+1);
           j++;
            System.out.println("the count " + count);
        }
        System.out.println(count);
    }
}
