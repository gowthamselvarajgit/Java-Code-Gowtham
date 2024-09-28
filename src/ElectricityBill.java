import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int price;

        if(unit <= 100){
            price = 0;
        }
        else if(unit <= 300){
            int remUnit = unit - 100;
            price = remUnit * 2;
        }
        else{
            int remUnit = unit - 300;
            int first300 = 400;
            price = first300 + remUnit * 5;
        }
        System.out.print(price);
    }
}
