import java.util.Scanner;

public class LargestNumInArray {
    public static int Largest(int []arr,int num){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<num;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int[] arr = new int[100];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Largest(arr,num);
        System.out.println("The largest element is "+ largest);
    }
}
