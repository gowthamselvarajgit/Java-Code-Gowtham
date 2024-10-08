import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the triangle: ");
        double side = sc.nextDouble();
        double area = Math.sqrt(3)/4 * side * side;
        System.out.println("The Area of the Triangle is: " + area);
    }
}
