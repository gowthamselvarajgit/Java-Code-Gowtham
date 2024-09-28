import java.util.Scanner;
public class GCD_RECERSIVE {
    public static int GCD_HELPER(int number1, int number2){
        if(number1 == 0){
            return number2;
        }
        if(number2 == 0){
            return number1;
        }

        return GCD_HELPER(number2,number1%number2);
    }
    public static int GCD_2_NUMBER(int number1, int number2){
        return GCD_HELPER(number1,number2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int gcd = GCD_2_NUMBER(number1 , number2);
        System.out.print("GCD = " + gcd);
    }
}
