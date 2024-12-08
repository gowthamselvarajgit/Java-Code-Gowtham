package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        for (int pointer1 = 0; pointer1 < size; pointer1++) {
            for (int pointer2 = pointer1+1; pointer2 < size; pointer2++) {
                if(array[pointer1] > array[pointer2]){
                    int temp = array[pointer1];
                    array[pointer1] = array[pointer2];
                    array[pointer2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
