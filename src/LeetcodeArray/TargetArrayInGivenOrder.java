package LeetcodeArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int[] indexArray = new int[size];
        for (int index = 0; index < size; index++) {
            indexArray[index] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            list.add(indexArray[index],array[index]);
        }
        int[] solution = new int[size];
        for (int index = 0; index < size; index++) {
            solution[index] = list.get(index);
        }
        System.out.println(Arrays.toString(solution));
    }
}
