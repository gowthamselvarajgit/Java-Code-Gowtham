import java.util.Scanner;

public class Largest_Element_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RowSize = sc.nextInt();
        int ColumSize = sc.nextInt();

        int[][] Matrix = new int[RowSize][ColumSize];
        for(int RowIndex = 0; RowIndex < RowSize; RowIndex += 1){
            for (int ColumnIndex = 0; ColumnIndex < ColumSize;ColumnIndex += 1){
                Matrix[RowIndex][ColumnIndex]= sc.nextInt();
            }
        }
        int Largest = Integer.MIN_VALUE;
        for(int RowIndex = 0; RowIndex < RowSize; RowIndex += 1){
            for (int ColumnIndex = 0; ColumnIndex < ColumSize;ColumnIndex += 1){
                if(Matrix[RowIndex][ColumnIndex] > Largest){
                    Largest = Matrix[RowIndex][ColumnIndex];
                }
            }
        }
        System.out.println("Largest: " + Largest);
    }
}
