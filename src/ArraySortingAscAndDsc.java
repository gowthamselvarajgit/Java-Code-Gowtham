import java.util.Scanner;

public class ArraySortingAscAndDsc {
    public static void Descending(int[] arr,int num){
        int temp = 0;
        for(int i =0;i<num;i++){
            for(int j = i+1;j<num;j++){
                if(arr[i] < arr[j]){
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
    public static void Ascending(int[] arr, int num){
        int temp = 0;
        for(int i = 0;i < num;i++){
            for(int j = i + 1; j < num;j++){
                if(arr[i]>arr[j]){
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
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of A Array: ");
        int num = sc.nextInt();

        System.out.println("Enter the elements in a array: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter 1 for Ascending Or 2 for Descending: ");
        int AorD = sc.nextInt();

        if(AorD == 1){
            Ascending(arr,num);
        }
        else if(AorD == 2){
            Descending(arr,num);
        }
    }
}
