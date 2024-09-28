/*MSD IS USED TO CONVERT THE DECIMAL OCTAL
FIRST ITERATION:
NUM = 12345
DIGIT = 12345%8;
DIGIT = 1;

OCTAL = 0 + 1 * 1;
OCTAL = 1;

POWER = 1*10;
POWER = 10;

NUM = NUM/8;
SECOND ITERATION:
NUM = 1543;
DIGIT = 1543 % 8;
DIGIT = 7;

OCTAL = 1 + 7*10;
OCTAL = 1 + 70;
OCTAL = 71

POWER = 10 * 10;
POWER = 100;
CONTINUE LIKE THIS

*/

import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int power = 1;
        int octal = 0;

        while(num != 0){
            digit = num % 8;
            octal = octal + digit * power;
            num = num/8;
            power = power * 10;
        }
        System.out.println("Octal " + octal);
    }
}
