import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float farenheit = sc.nextFloat();
        Float celcius = (farenheit - 32) * 5/9;
        System.out.printf("Farenheit : %.2f"  + " Celcius: %.2f", farenheit,celcius);
        double faren = sc.nextDouble();
        double celc = (faren-32) * 5/9;
        System.out.printf("Farenheit : %.2f" + " Celcius : %.2f",faren,celc);
    }
}
