import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Enter the Base Length of the triangle: ");
        double base = sc.nextDouble();
        double area = 0.5 * height * base;
        System.out.println("Area of triangle = " + area);
    }
}
