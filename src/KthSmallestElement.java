import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int index = 0; index < arraySize; index += 1){
            array[index] = sc.nextInt();
        }
        int kthElement = sc.nextInt();

        for(int outerIndex = 0; outerIndex < arraySize; outerIndex += 1){
            for (int innerIndex = 0; innerIndex < arraySize; innerIndex += 1){
                if(array[outerIndex] < array[innerIndex]){
                    int temp = array[outerIndex];
                    array[outerIndex] = array[innerIndex];
                    array[innerIndex] = temp;
                }
            }
        }
        for(int index =0; index < arraySize; index += 1){
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.print(array[kthElement - 1]);
    }
}
