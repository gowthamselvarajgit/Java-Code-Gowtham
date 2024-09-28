import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize ; index +=1){
            array[index] = scan.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int index = 0; index < arraySize; index += 1){
            if(array[index] > largest) {
                largest = array[index];
            }
        }
        System.out.print("Largest: " + largest);
    }
}
