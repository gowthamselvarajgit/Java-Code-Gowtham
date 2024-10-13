import java.util.Scanner;

public class SumTwoNumbersFun {
    static int summer(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int sum = summer(num1,num2);
        System.out.println(sum);
    }
}
