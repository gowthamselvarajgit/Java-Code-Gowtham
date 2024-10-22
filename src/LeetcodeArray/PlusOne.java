package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int[] changedArray = plusone(array);
        System.out.println(Arrays.toString(changedArray));
    }
    static int[] plusone(int[] array){
        int size = array.length;
        for(int index = size-1; index >= 0; index--){
            if(array[index] != 9){
                array[index]+=1;
                return array;
            }
            array[index] = 0;
        }
        int[] newArray = new int[size+1];
        newArray[0] = 1;
        return newArray;
    }
}
