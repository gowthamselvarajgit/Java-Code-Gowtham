import java.util.Scanner;

public class PrimeChecker {
    static boolean prime(int num){
        if (num == 0 || num == 1){
            return false;
        }
        if(num == 2 || num == 3){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for (int i = 3; i * i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(prime(num)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
