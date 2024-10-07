import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle : ");
        double diameter = sc.nextDouble();
        double pi = Math.PI;
        double radius = diameter/2;
        double area = pi * radius * radius;
        System.out.println("Area of the circle is : " + area);
    }
}
