import java.util.Scanner;
public class ReplaceWithSumOfRyt {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i =0;i<num;i++){
            for(int j = i+1;j<num;j++){
                sum = sum + arr[j];
            }
            arr[i] = sum;
            sum = 0;
        }
        for(int i =0;i<num;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
