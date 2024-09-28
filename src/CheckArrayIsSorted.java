import java.util.Scanner;
public class CheckArrayIsSorted {
    static boolean checksorted(int[] arr,int num){
        for(int i =0;i<num;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int []arr = new int[10];
        int flag = 0;
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = checksorted(arr,num);
        if(result){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
