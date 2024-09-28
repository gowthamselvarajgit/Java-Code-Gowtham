import java.util.Scanner;

public class Value_Check_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RowSize = sc.nextInt();
        int ColumnSize = sc.nextInt();
        int[][] Matrix = new int[RowSize][ColumnSize];
        for(int RowIndex = 0; RowIndex < RowSize; RowIndex += 1){
            for(int ColumnIndex = 0; ColumnIndex < ColumnSize; ColumnIndex += 1){
                Matrix[RowIndex][ColumnIndex] = sc.nextInt();
            }
        }
        int Number = sc.nextInt();
        int Checker = 0;
        int IndexFinderRow = 0;
        int IndexFinderColumn = 0;
        for(int RowIndex = 0; RowIndex < RowSize; RowIndex += 1){
            for(int ColumnIndex = 0; ColumnIndex < ColumnSize; ColumnIndex += 1){
                if(Matrix[RowIndex][ColumnIndex] == Number){
                    Checker = 1;
                    IndexFinderRow = RowIndex;
                    IndexFinderColumn = ColumnIndex;
                    System.out.println("Number Found at: " + IndexFinderRow + "," + IndexFinderColumn );
                }
            }
        }
        if(Checker != 1){
            System.out.println("No Number Found");
        }
    }
}
