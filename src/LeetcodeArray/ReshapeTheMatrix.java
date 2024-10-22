package LeetcodeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int[][] oldMatrix = new int[rowSize][columnSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                oldMatrix[row][column] = sc.nextInt();
            }
        }
        int newRowSize = sc.nextInt();
        int newColumnSize = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < rowSize; row++) {
            for (int colummn = 0; colummn < columnSize; colummn++) {
                list.add(oldMatrix[row][colummn]);
            }
        }
        int index = 0;
        int[][] newMatrix = new int[newRowSize][newColumnSize];
        for (int row = 0; row < newRowSize; row++) {
            for (int column = 0; column < newColumnSize; column++) {
                newMatrix[row][column] = list.get(index);
                index += 1;
            }
        }
        for(int[] row : newMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
