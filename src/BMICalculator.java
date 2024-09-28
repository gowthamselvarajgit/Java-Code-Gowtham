import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();//in inches
        double weight = sc.nextDouble();//in pounds
        double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);// changed to kg/m2
        System.out.print(bmi);
    }
}
