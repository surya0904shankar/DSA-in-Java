import java.util.Scanner;

public class StringPalindrome {
    public static String retainAlphabets(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("Enter a character string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String palindrome = retainAlphabets(s);
        char[] arr = palindrome.toLowerCase().toCharArray();
        int i=0;
        int j=arr.length-1;
        int flag=0;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
                flag=1;
            } else {
                System.out.println("String is not a palindrome");
                break;
            }
        }
        if (flag == 1) {
            System.out.println("String is a palindrome");
        }

    }
}
