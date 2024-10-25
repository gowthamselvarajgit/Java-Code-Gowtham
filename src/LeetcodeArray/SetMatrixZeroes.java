package LeetcodeArray;

import java.util.Scanner;

public class SetMatrixZeroes {
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
        for (int[] row : matrix){
            for (int index = 0; index < row.length; index++) {
                if (row[index] == 0){

                }
            }
        }
    }
}
