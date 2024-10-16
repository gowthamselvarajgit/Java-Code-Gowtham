package LeetcodeArray;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int[][] bank = new int[rowSize][columnSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                bank[row][column] = sc.nextInt();
            }
        }
        int max = 0;
        for (int row = 0; row < rowSize; row++) {
            int sum = 0;
            for (int column = 0; column < columnSize; column++) {
                sum = sum + bank[row][column];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
