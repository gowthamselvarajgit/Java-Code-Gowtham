import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int temp = num;
        int remainder;
        int result = 0;
        int digit=0;

        while(temp!=0){
            temp = temp/10;
            digit++;
        }
        temp = num;
        while(temp != 0){
            remainder = temp % 10;
            result += (int)(Math.pow(remainder,digit));
            temp = temp/10;
        }

        if(result == num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}
