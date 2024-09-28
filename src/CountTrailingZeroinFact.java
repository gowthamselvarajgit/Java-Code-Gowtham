import java.util.Scanner;
public class CountTrailingZeroinFact {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int power = 1;
        while(power <= num){
            power = power * 5;
            res = res + (num/power);
        }
        System.out.println(res);
    }
}
