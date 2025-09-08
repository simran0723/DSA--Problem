class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}
public class Min_Max {
   // public static void main(String[] args) {
        public Pair<Integer, Integer> getMinMax(int[] arr) {
            int n = arr.length;
            int max = Integer .MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if (arr[i]<min){
                    min = arr[i];
                }
                //max
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            Pair<Integer, Integer> p = new Pair<>(min, max);
            return p;
        }

    public static void main(String[] args) {

    }
    }



