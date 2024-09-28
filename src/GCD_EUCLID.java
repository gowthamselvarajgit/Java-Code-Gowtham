import java.util.Scanner;
public class GCD_EUCLID {
    public static  long GCD_2_NUMBER(long num1, long num2){
        while(num2 != 0) {
            long temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] a ){
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long result = GCD_2_NUMBER(num1 , num2);
        System.out.print("Gcd is :" + result);
    }
}
