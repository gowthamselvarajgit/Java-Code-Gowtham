import java.util.Scanner;

public class GreetingMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String greeting = name + ",Welcome you for the party";
        System.out.println(greeting);
    }
}
