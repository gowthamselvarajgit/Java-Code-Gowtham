package LeetcodeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumbersMatrix {
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
        ArrayList<Integer> rowMin = new ArrayList<>();
        for (int row = 0; row < rowSize; row++) {
            int min = Integer.MAX_VALUE;
            for (int column = 0; column < columnSize; column++) {
                if(matrix[row][column] < min){
                    min = matrix[row][column];
                }
            }
            rowMin.add(min);
        }
        ArrayList<Integer> columnMax = new ArrayList<>();
        for (int column = 0; column < columnSize; column++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < rowSize; row++) {
                if(matrix[row][column] > max){
                    max = matrix[row][column];
                }
            }
            columnMax.add(max);
        }
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        for (int min : rowMin) {
            if (columnMax.contains(min)) {
                luckyNumbers.add(min);
            }
        }
        System.out.println(luckyNumbers);
    }
}
