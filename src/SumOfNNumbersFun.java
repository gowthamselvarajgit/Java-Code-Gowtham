import java.util.Scanner;

public class SumOfNNumbersFun {
    static int summer(int range){
        int sum = 0;
        for(int start = 1; start <= range; start += 1){
            sum = sum + start;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = summer(range);
        System.out.println(sum);
    }
}
