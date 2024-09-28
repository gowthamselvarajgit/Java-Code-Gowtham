import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0;i<num/2;i++){
                int j = num - 1 - i;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
        }
        for(int i = 0;i<num;i++){
            System.out.print(arr[i]);
        }
    }
}
