import java.util.Scanner;

public class Sum_Elements_In_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Column = sc.nextInt();
        int[][] MultiArray = new int[Row][Column];
        for(int IndexRow = 0; IndexRow < Row; IndexRow += 1){
            for(int IndexColumn = 0; IndexColumn < Column; IndexColumn += 1){
                MultiArray[IndexRow][IndexColumn] = sc.nextInt();
            }
        }
        int Sum = 0;
        for(int IndexRow = 0; IndexRow < Row; IndexRow += 1){
            for(int IndexColumn = 0; IndexColumn < Column; IndexColumn += 1){
                Sum = Sum + MultiArray[IndexRow][IndexColumn];
            }
        }
        System.out.print("Sum " + Sum);
    }
}
