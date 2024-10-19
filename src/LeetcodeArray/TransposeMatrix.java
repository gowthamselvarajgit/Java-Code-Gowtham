package LeetcodeArray;

import java.util.Scanner;
import java.util.Arrays;
public class TransposeMatrix {
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
        int[][] transposeMatrix = new int[columnSize][rowSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                transposeMatrix[column][row] = matrix[row][column];
            }
        }
        for (int[] row  : transposeMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
