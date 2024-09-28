import java.util.Scanner;

public class AlternateElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize ; index += 1){
            array[index] = scan.nextInt();
        }
        for(int index = 0; index < arraySize ; index += 2){
            System.out.print(array[index] + " ");
        }
    }
}
