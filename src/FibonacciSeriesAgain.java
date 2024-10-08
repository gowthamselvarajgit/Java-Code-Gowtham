import java.util.Scanner;

public class FibonacciSeriesAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 0;
        while(count != range){
            int next = first + second;
            System.out.print(first + " ");
            first = second;
            second = next;
            count += 1;
        }
    }
}
