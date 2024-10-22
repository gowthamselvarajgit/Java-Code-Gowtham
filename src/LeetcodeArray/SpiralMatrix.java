package LeetcodeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();

        int[][] matrix = new int[rowSize][columnSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = rowSize-1;
        int left = 0;
        int right = columnSize - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(top <= bottom && left <= right) {
            // left to right
            for (int index = left; index <= right; index += 1) {
                list.add(matrix[top][index]);
            }
            top += 1;

            // top to bottom
            for (int index = top; index <= bottom; index += 1) {
                list.add(matrix[index][right]);
            }
            right -= 1;

            if (top <= bottom) {
                // right to left
                for (int index = right; index >= left; index--) {
                    list.add(matrix[bottom][index]);
                }
                bottom--;
            }

            // Check before traversing bottom to top
            if (left <= right) {
                // bottom to top
                for (int index = bottom; index >= top; index--) {
                    list.add(matrix[index][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
