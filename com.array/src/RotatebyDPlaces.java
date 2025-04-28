import java.util.Arrays;
import java.util.Scanner;

public class RotatebyDPlaces {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int n;
        System.out.println("Enter the value of d");
        n = sc.nextInt();
        RotatebyDPlaces(arr, n);
    }

    public static void RotatebyDPlaces(int[] arr, int n) {
            reverse(arr,0,n-1);
            reverse(arr,n,arr.length-1);
            reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

