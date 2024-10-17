package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < size; index += 1){
            array[index] = sc.nextInt();
        }
        int[] outputArray = new int[size+1];
        System.out.println(Arrays.toString(array) + Arrays.toString(outputArray));
        for(int index = 0; index < size; index += 1){
            outputArray[index+1] = outputArray[index] + array[index];
        }
        System.out.println(Arrays.toString(array) + Arrays.toString(outputArray));
        int max = outputArray[0];
        for(int index = 0; index < size+1; index += 1){
            if(outputArray[index] > max){
                max = outputArray[index];
            }
        }
        System.out.println(max);
    }
}
