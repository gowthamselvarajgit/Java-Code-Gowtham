import java.util.Scanner;

public class EvenOrOddFun {
    static String checker(int num){
        if(num % 2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = checker(num);
        System.out.println(result);
    }
}
