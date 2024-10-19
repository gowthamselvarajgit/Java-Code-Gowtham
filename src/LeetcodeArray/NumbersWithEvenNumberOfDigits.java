package LeetcodeArray;

import java.util.Scanner;

public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int evenCount = 0;
        for (int index = 0; index < size; index++) {
            int temp = array[index];
            int count = 0;
            while(temp != 0){
                count = count + 1;
                temp = temp / 10;
            }
            if(count % 2 == 0){
                evenCount += 1;
            }
        }
        System.out.println(evenCount);
    }
}
