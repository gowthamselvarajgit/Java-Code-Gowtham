import java.util.Scanner;

public class OddEvenAddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        for (int number = 1; number <= range; number++) {
            int numberMaker = 1;
            if (number % 2 != 0){
                numberMaker = number * number;
            }
            else{
                numberMaker = number * number * number;
            }
            sum = sum + numberMaker;
        }
        System.out.println(sum);
    }
}
