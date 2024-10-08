import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side of the triangle: ");
            double side = sc.nextDouble();
            double perimeter = 3 * side;
            System.out.println("The perimeter is " + perimeter);
        }
}
