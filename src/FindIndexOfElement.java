import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int target = scan.nextInt();
        for(int index = 0; index < arraySize; index += 1){
            if(array[index] == target){
                System.out.print(index);
            }
        }
    }
}
