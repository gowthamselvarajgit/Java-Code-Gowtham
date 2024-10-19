package LeetcodeArray;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < size ; index += 1){
            array[index] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int first = 0; first < size; first++) {
            for (int second = first + 1; second < size; second++) {
                if(array[first]+array[second] == target){
                    System.out.println("[" + first + "," + second + "]");
                }
            }
        }
    }
}
