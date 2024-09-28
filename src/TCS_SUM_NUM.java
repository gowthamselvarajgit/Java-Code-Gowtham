import java.util.Scanner;
public class TCS_SUM_NUM {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Working_power;
        int digit;
        int sum;
        int copy;

        Working_power = 10;
        digit = 0;
        sum = num;

        while(Working_power < num) {
            copy = num;
            while (copy >= (Working_power/10)) {
                digit = copy % Working_power;
                sum = sum + digit;
                copy = copy / 10;
            }
            System.out.println("Working Power = " + Working_power);
            Working_power = Working_power*10;
        }
        System.out.println(sum);
    }
}
