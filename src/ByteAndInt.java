import java.util.Scanner;

public class ByteAndInt {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = 257;
        byte changer =(byte)(num);
        System.out.println(changer);
        byte number1 = 20;
        byte number2 = 30;
        byte number3 = 10;
        int result = number1 * number2 / number3;
        System.out.println(result);
        /*
         we will get an value 1 because the maximum size of the byte if 256 and we are giving larger than that so it make
         an difference between given number and the size of byte that is 256.
         given number is 257
         size of the byte is 256
         257-256 = 1

         */

    }
}
