import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        Number = sc.nextInt();
        int CopyNumber = Number;
        if(Number < 0){
            System.out.print("Not a Palindrome");
        }
        else {
            int rev = 0;
            while (CopyNumber != 0) {
                int Digit = CopyNumber % 10;
                rev = rev * 10 + Digit;
                CopyNumber = CopyNumber / 10;
            }
            if (rev == Number) {
                System.out.print("Palindrome");
            } else {
                System.out.print("Not a Palindrome");
            }
        }
    }
}
