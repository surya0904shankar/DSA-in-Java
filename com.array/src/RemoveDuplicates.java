import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] arr) {
        int i=0;
        for (int j=1;j<arr.length;j++) {
            if (arr[j-1] != arr[j]) {
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println("Number of non Duplicate elements in array: "+i+1);
    }
}
