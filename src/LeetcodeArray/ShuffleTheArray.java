package LeetcodeArray;

import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenSize = sc.nextInt();
        int realSize = givenSize * 2;
        int[] array = new int[realSize];
        for (int index = 0; index < realSize; index++) {
            array[index] = sc.nextInt();
        }

    }
}
