package LeetcodeArray;

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int count = 0;
        for (int firstPoint = 0; firstPoint < size; firstPoint++) {
            for (int secondPoint = firstPoint+1; secondPoint < size; secondPoint++) {
                if(array[firstPoint] == array[secondPoint]){
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}
