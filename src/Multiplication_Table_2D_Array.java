import java.util.Scanner;

public class Multiplication_Table_2D_Array {
    public static int[][] TableMaker(int MatrixSize ){
        int[][] Table = new int[MatrixSize][MatrixSize];
        for(int Row = 0; Row < MatrixSize; Row += 1){
            for(int Column = 0; Column < MatrixSize; Column += 1){
                Table[Row][Column]=  (Row+1) * (Column+1);
            }
        }
        return Table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MatrixSize = sc.nextInt();
        int[][] result;
        result = TableMaker(MatrixSize);

        for(int Row = 0; Row < MatrixSize; Row += 1){
            for(int Column = 0; Column < MatrixSize; Column +=1){
                System.out.print(result[Row][Column] + " ");
            }
            System.out.println();
        }
    }
}
