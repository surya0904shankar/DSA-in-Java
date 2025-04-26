import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total digits");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        int i=0;
        int j=n-1;
        int flag=0;
        while(i<j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("True");
                flag=1;
                break;
            } else if (arr[i] + arr[j] > target) {
                j--;
            }
            else{
                i++;
            }

        }
        if(flag!=1){
        System.out.println("False");}
    }
}
