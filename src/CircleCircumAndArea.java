import java.util.Scanner;

public class CircleCircumAndArea {
    static void circumference(double radius){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Cirucumference = " + circumference);
    }
    static void area(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("Radius = " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        circumference(radius);
        area(radius);
    }
}
