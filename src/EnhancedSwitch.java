import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("It is a Weekday");
            case 6,7 -> System.out.println("It is a Weekend");
            default -> System.out.println("It is invalid day");
        }
    }
}
