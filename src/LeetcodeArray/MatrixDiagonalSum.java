package LeetcodeArray;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int[][] matrix = new int[rowSize][columnSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                if(row == column || row + column == rowSize-1){
                    sum = sum + matrix[row][column];
                }
            }
        }
        System.out.println(sum);
    }
}
