import java.util.Scanner;
public class InchToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch = sc.nextFloat();
        double meter = inch * 0.0254;
        System.out.println("Inch : " + inch + "Meter "+ meter);
    }
}
