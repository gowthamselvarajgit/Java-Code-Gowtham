import java.util.Scanner;

public class Reverse_Num {
    public static void main(String []a){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rev=0;
        while(num != 0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
