import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("The max element is "+max);
    }
}
