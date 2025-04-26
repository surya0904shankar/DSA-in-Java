import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        sorted(arr);
    }
    public static void sorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]) {
                continue;
            }
            else{
                isSorted = false;
                break;

            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
