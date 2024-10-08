import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
    }
}
