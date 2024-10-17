package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingAnImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int[][] image = new int[rowSize][columnSize];
        for(int row = 0; row < rowSize; row += 1){
            for (int column = 0; column < columnSize; column++) {
                image[row][column] = sc.nextInt();
            }
        }
        for (int[] row : image) {
            int start = 0;
            int end = columnSize-1;
            while(start <= end){
                int temp = row[start] == 0 ? 1 : 0;
                row[start] = row[end] == 0 ? 1 : 0;
                row[end] = temp;
                start += 1;
                end -= 1;
            }
        }
        for (int[] row : image){
            System.out.println(Arrays.toString(row));
        }
    }
}
