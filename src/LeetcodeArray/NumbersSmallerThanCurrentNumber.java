package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int[] largeCounter = new int[size];
        for (int firstPointer = 0; firstPointer < size; firstPointer++) {
            for(int secondPointer = 0; secondPointer < size; secondPointer++){
                if(array[firstPointer] > array[secondPointer]){
                    largeCounter[firstPointer]++;
                }
            }
        }
        System.out.println(Arrays.toString(largeCounter));
    }
}
