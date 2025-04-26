import java.util.Arrays;

public class MinAverage {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,8,9 };
        int i=0;
        int j=arr.length-1;
        int[] Narr=new int[arr.length];
        int n=0;
        while(i<j){

                Narr[n]=((arr[i]+arr[j])/2);
                i++;
                j--;
                n++;
        }
        System.out.println(Arrays.toString(Narr));
    }
}
