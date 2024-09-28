import java.util.Arrays;
import java.util.Scanner;

public class NumberAppearOnceBetter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index+=1){
            array[index] = scan.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        for(int index =0;index<arraySize;index+=1){
            if(array[index] > largest){
                largest = array[index];
            }
        }

        int[] hashArray = new int[largest+1];
        Arrays.fill(hashArray , 0);

        for(int index = 0; index < arraySize; index += 1){
            hashArray[array[index]]++;
        }
        for(int index =0; index < largest+1;index += 1) {
            System.out.print(hashArray[index] + " ");
        }
        System.out.println();
        for(int index =0;index < largest+1;index += 1){
            if(hashArray[array[index]] == 1){
                System.out.print(array[index]);
            }
       }
    }
}
