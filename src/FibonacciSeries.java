import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        int count = 2;
        while(count != range) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count += 1;
        }

    }
}
