import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println(Arrays.toString(array));
    }
}
