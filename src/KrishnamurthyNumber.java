import java.util.*;
public class KrishnamurthyNumber {
    static int factorial(int number){
        int fact = 1;
        for (int start = 1; start <= number; start++) {
            fact = fact * start;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int copyNumber = number;
        int fact = 1;
        int sum = 0;
        while (copyNumber != 0){
            int digit = copyNumber % 10;
            fact = factorial(digit);
            copyNumber = copyNumber / 10;
            sum = sum + fact;
        }
        if (sum == number){
            System.out.println("Krihnamurthy Number");
        }
        else{
            System.out.println("Not a krishnamurthy Number");
        }
    }
}
