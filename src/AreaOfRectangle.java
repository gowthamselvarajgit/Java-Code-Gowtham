import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the Width");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
