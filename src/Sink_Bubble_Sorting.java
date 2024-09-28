import java.util.Scanner;
public class Sink_Bubble_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size_Array = sc.nextInt();
        int[] Array = new int[Size_Array];
        for(int Index = 0;Index < Size_Array;Index++) {
            Array[Index] = sc.nextInt();
        }

        for(int Iter = 0; Iter < Size_Array ; Iter++){
            for (int Index  = 0;Index < Size_Array-(Iter + 1);Index++){
                if(Array[Index] > Array[Index+1]){
                    int Temp = Array[Index];
                    Array[Index] = Array[Index + 1];
                    Array[Index+1] = Temp;
                }
            }
        }
        for(int Index  = 0;Index < Size_Array; Index++){
            System.out.print(Array[Index] + " ");
        }
    }
}
