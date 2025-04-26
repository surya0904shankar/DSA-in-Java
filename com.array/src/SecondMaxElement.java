import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondMax=-1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max = arr[i];

            }
            else if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("The second highest element is "+secondMax);
    }
}
