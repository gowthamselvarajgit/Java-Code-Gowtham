import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestInUnsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < size; index += 1){
            array[index] = sc.nextInt();
        }
        int kElement = sc.nextInt();

        Arrays.sort(array);
        int indexFiner = 0;
        for(int index = 0; index < size; index += 1){
            if(array[index] == kElement){
                indexFiner = index;
            }
        }
        System.out.print(array[indexFiner+1]);
    }
}
