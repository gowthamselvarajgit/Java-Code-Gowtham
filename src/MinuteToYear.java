import java.util.Scanner;

public class MinuteToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minute = sc.nextDouble();
        double minuteInYear = 60 * 24 * 365;
        long year = (long)(minute/minuteInYear);
        int days = (int) (minute/60/24)%365;
        System.out.print(year + " - " + days );
    }
}
