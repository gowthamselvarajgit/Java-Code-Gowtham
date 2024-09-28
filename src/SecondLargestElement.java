import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int index = 0; index < arraySize; index += 1){
            if(largest < array[index]){
                secondLargest = largest;
                largest = array[index];
            }
            else if(array[index] > secondLargest && array[index] != largest){
                secondLargest = array[index];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
