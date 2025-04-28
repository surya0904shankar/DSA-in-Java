import java.util.Arrays;
import java.util.Scanner;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void moveZeros(int[] arr) {
        int j=-1;
        for (int k : arr) {
            if (k != 0) {
                j++;
            } else {
                j++;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }
}
