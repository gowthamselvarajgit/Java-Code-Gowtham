package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int newSize = size * 2;
        int[] newArray = new int[newSize];
        for(int index = 0; index < size; index += 1){
            newArray[index] = array[index];
        }
        int repeater = 0;
        for (int index = size; index < newSize; index++) {
            newArray[index] = array[repeater];
            repeater += 1;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
