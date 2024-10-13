import java.util.Scanner;

public class PalindromeOrNotFun {
    static boolean paliChecker(int num){
        int copy = num;
        int rev = 0;
        while(copy != 0){
            int digit = copy % 10;
            rev = rev * 10 + digit;
            copy = copy / 10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(paliChecker(num)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
