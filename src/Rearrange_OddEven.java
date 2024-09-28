import java.util.Scanner;
public class Rearrange_OddEven {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int copy;
        int evenGroup;
        int OddGroup;
        int evenPower;
        int oddPower;
        int digit;
        int result;

        evenGroup = 0;
        OddGroup = 0;
        evenPower = 1;
        oddPower = 1;
        copy = num;
        while(copy != 0){
            digit = copy % 10;
            if(digit % 2 == 0){
                evenGroup = digit * evenPower + evenGroup;
                evenPower = evenPower*10;
            }
            else{
                OddGroup = digit * oddPower + OddGroup;
                oddPower = oddPower * 10;
            }
            copy = copy/10;
        }
        System.out.println("Even = " +evenGroup);
        System.out.println("Odd = " + OddGroup);
        result = (OddGroup * evenPower) + evenGroup;
        System.out.println("Result is " + result);
    }
}
