import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = sc.nextInt();
        }
        int numSum = (arraySize * (arraySize + 1)) / 2;
        int sum = 0;
        for(int index = 0; index < arraySize-1; index += 1){
            sum = sum + array[index];
        }
        int result = numSum - sum;
        System.out.print(result);
    }
}
