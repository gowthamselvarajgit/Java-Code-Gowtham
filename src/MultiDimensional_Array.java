import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No_of_Rows = sc.nextInt();
        int No_of_Column = sc.nextInt();
        int[][] MultiArray = new int[No_of_Rows][No_of_Column];
        for(int Row = 0; Row < No_of_Rows; Row += 1){
            for(int Column = 0; Column < No_of_Column; Column += 1){
               MultiArray[Row][Column] = sc.nextInt();
            }
        }
        for(int Row = 0; Row < No_of_Rows; Row += 1){
            for(int Column = 0; Column < No_of_Column; Column += 1){
                System.out.print(MultiArray[Row][Column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] Array : MultiArray){
            for(int Number : Array){
                System.out.print(Number + " ");
            }
            System.out.println();
        }
    }
}
