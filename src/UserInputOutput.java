import java.util.Scanner;

public class UserInputOutput {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Name is " + name + " and age is "+ age);
    }
}
