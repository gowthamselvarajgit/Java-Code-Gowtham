import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        float dollar = rupees * 0.012f;
        System.out.println("Rupees of " + rupees + "₹ " + "is " + dollar + "$");
    }
}
