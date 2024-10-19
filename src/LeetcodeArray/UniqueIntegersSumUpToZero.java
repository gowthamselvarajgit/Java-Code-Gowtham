package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int starter = -1 * size/2;
        if(size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                array[i] = starter;
                starter += 1;
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if(starter == 0) {
                    starter += 1;
                }
                array[i] = starter;
                starter += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
