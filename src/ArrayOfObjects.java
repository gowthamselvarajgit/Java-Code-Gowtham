import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] array = new String[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.next();
        }
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
