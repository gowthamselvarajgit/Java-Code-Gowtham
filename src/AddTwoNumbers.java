import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("The result is " + result);
    }
}
