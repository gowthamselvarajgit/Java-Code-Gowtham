package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }
        int[] changedArray = new int[size];
        for (int index = 0; index < size; index++) {
            changedArray[index] = arr[arr[index]];
        }
        System.out.println(Arrays.toString(changedArray));
    }
}
