import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Diagonal 1: ");
        double diagonal1 = sc.nextDouble();
        System.out.println("Enter the length of Diagonal 2: ");
        double diagonal2 = sc.nextDouble();
        double area = (diagonal1 * diagonal2)/2;
        System.out.println("The area of the rhombus is: " + area);


    }
}
