import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal = sc.nextInt();
        long Binary=0;
        int power = 1;
        while(Decimal != 0){
            Binary = Binary + (Decimal % 2) * power;
            Decimal = Decimal / 2;
            power = power * 10;
        }
        System.out.println("Binary: "+Binary);
    }
}
