import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int rowSize = sc.nextInt();
        int[][] array = new int[rowSize][];
        for (int row = 0; row < rowSize; row++) {
            int columnSize = sc.nextInt();
            array[row] = new int[columnSize];
            for (int column = 0; column < columnSize; column++) {
                array[row][column] = sc.nextInt();
            }
        }
        for (int row = 0; row < rowSize; row++) {
            System.out.println(Arrays.toString(array[row]));
        }
    }
}
