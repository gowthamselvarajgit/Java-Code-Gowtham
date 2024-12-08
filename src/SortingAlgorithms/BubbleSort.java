package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < size; index += 1){
            array[index] = sc.nextInt();
        }

        for (int pointer1 = 0; pointer1 < size - 1  ; pointer1++) {
            for (int pointer2 = 0; pointer2 < size - pointer1 - 1; pointer2++) {
                if(array[pointer2] > array[pointer2+1]){
                    int temp = array[pointer2];
                    array[pointer2] = array[pointer2+1];
                    array[pointer2+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
