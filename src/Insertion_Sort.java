import java.util.Scanner;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size_Array = sc.nextInt();
        int[] Array = new int[Size_Array];
        for(int Index = 0; Index < Size_Array; Index++){
            Array[Index] = sc.nextInt();
        }
        int Safe;
        int Shift;

        for(int Unsorted_Side = 1; Unsorted_Side < Size_Array;Unsorted_Side++){
            Safe = Array[Unsorted_Side];
            for(Shift = Unsorted_Side - 1; Shift > 0 && Array[Shift] > Safe; Shift--){

            }
        }
    }
}
