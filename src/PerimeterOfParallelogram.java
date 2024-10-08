import java.util.Scanner;

public class PerimeterOfParallelogram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base: ");
            double base = sc.nextDouble();
            System.out.println("Enter the side: ");
            double side = sc.nextDouble();
            double perimeter = 2*(base + side);
            System.out.println("The perimeter is " + perimeter);
        }
}

