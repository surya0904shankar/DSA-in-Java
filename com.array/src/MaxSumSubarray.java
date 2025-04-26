import java.util.Arrays;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,88,6,2};
        int sum=maximumSumSubarray(arr,2);
        System.out.println(sum);
    }
        public static int maximumSumSubarray(int[] arr, int k) {
            int n = arr.length;
            int i = 0;
            int[] Msum=new int[n];
            while(k<n){
                Msum[i]= Arrays.stream(arr,i,k).sum();
                i++;
                k++;}
            int max= Arrays.stream(Msum).max().getAsInt();
            return max;
        }
}
