import java.util.Scanner;

public class SumOfTwoLargestNum {
    public static int SumLargest(int[] arr , int num){
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i =0;i<num;i++){
            if(arr[i]>Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
        }
        int sum = Largest + SecondLargest;
        return sum;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i] =  sc.nextInt();
        }

        int result = SumLargest(arr , num);
        System.out.println("The Sum is " + result);
    }
}
