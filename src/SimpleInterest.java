import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        int principalAmt = sc.nextInt();
        System.out.println("Enter the Time: ");
        int time = sc.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        float rate = sc.nextFloat();
        float SimpleInterest = principalAmt * time * rate / 100;
        System.out.println("Simple Interset is :" + SimpleInterest);
    }
}
