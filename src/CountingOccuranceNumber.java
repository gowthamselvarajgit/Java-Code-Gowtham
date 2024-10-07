import java.util.Arrays;
import java.util.Scanner;

public class CountingOccuranceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int size = 10;
        int[] array = new int[size];
        Arrays.fill(array,0);
        long copy = number;
        while(number != 0){
            int digit = (int) (number % 10);
            array[digit]++;
            number = number/10;
        }
        for(int index = 0; index < size; index += 1){
            System.out.println(index+ " Numbers are"+ ":" + array[index]);
        }
    }
}
