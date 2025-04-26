import java.util.Scanner;

public class Fibonacci {
    public static int fibb(int n){
     if(n<=1) return n;
     else{
        return fibb(n-1) + fibb(n-2);
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        int out=fibb(i);
        System.out.println(out);
    }
    }
}
