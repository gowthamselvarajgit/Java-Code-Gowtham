import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        double average = 0;
        int sum = 0;
        for(int i = 0;i<num;i++){
            sum = sum + arr[i];
        }
        average = (double)sum / num;

        System.out.print(average);
    }
}
