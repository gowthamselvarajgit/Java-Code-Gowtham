import java.util.Scanner;
public class SmallestFirstSorting {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for(int i = 0;i<num;i++){
            for(int j = i +1;j<num;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<num;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
