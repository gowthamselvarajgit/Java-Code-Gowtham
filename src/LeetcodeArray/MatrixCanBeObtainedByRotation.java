package LeetcodeArray;

import java.util.Scanner;

public class MatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int[][] matrix = new int[rowSize][columnSize];
        int[][] targetMatrix = new int[rowSize][columnSize];

        // Input original matrix
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }

        // Input target matrix
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                targetMatrix[row][column] = sc.nextInt();
            }
        }

        // Check if rotation can make matrix equal to targetMatrix
        if (findRotation(matrix, targetMatrix)) {
            System.out.println("Matrix can be obtained by rotation.");
        } else {
            System.out.println("Matrix cannot be obtained by rotation.");
        }
    }

    static boolean findRotation(int[][] matrix, int[][] target) {
        // Try up to 4 rotations (0, 90, 180, 270 degrees)
        for (int rotate = 0; rotate < 4; rotate++) {
            if (areMatricesEqual(matrix, target)) {
                return true;
            }
            rotate90Degrees(matrix);
        }
        return false;
    }

    static void rotate90Degrees(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap elements across the diagonal)
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Step 2: Reverse each row to complete 90-degree clockwise rotation
        for (int row = 0; row < n; row++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
