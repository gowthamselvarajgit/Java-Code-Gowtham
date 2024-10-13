import java.util.Scanner;

public class FactorialFun {
    static int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num ; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
}
