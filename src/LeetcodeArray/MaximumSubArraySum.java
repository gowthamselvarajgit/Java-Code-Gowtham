package LeetcodeArray;

import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int index = 0; index < size; index += 1){
            if(sum == 0){
                start = index;
            }
            sum =  sum + array[index];
            if(sum >  max){
                max = sum;
                ansStart = start;
                ansEnd = index;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
        for (int index = ansStart; index <= ansEnd; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
