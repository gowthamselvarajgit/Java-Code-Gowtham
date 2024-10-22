package LeetcodeArray;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int index1 = 0;
        for(int index2 = 1; index2 < size; index2 += 1){
            if(array[index1] != array[index2]){
                array[index1+1] = array[index2];
                index1 = index1 + 1;
            }
        }
        for(int index = 0; index <= index1; index += 1){
            System.out.print(array[index] + " ");
        }
    }
}
