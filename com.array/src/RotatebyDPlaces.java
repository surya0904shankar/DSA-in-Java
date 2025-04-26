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

    }
}
