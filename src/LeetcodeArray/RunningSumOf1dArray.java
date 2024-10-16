package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        for(int index = 1; index < size; index += 1){
            array[index] = array[index-1] + array[index];
        }
        System.out.println(Arrays.toString(array));
    }
}
