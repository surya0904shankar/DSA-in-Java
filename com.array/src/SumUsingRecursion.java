public class SumUsingRecursion {

    public static int addTwoNumbers(int num1, int num2) {
        if (num2 == 0){
        return num1;}
    else{
        return addTwoNumbers(num1 + 1, num2 - 1);}
    }
    public static void main(String[] args) {
int o=addTwoNumbers(7,8);
        System.out.println(o);
    }
}
