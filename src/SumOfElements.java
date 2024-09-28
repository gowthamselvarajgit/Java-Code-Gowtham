import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int sum = 0;
        for(int index = 0; index < arraySize; index += 1){
            sum = sum + array[index];
        }
        System.out.print(sum);
    }
}
