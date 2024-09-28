import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int givenNum = scan.nextInt();
        int left = 0;
        int right = 0;
    }
}
