import java.util.Scanner;

public class SecondLargestNum {
    public static int SecondLargest(int []arr,int num){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<num;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int result = SecondLargest(arr,num);
        System.out.println(result);
    }
}
