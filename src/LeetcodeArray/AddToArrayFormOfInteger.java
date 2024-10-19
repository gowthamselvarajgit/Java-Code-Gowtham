package LeetcodeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] array =  new long[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextLong();
        }
        long num = sc.nextInt();
        long numGenerated = array[0];
        for (int index = 1; index < size; index++) {
            numGenerated = numGenerated * 10 + array[index];
        }
        long sum = numGenerated + num;
        ArrayList<Long> list = new ArrayList<>();
        long digitSize = 0;
        long copy = sum;
        while(copy != 0){
            digitSize += 1;
            copy = copy / 10;
        }
        long power = 1;
        for(int i = 1; i < digitSize; i+=1){
            power = power * 10;
        }
        while (power != 0){
            list.add(sum / power);
            sum = sum % power;
            power = power / 10;
        }
        System.out.println(list);
    }
}
