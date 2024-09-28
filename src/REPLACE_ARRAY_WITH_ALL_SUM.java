import java.util.Scanner;
public class REPLACE_ARRAY_WITH_ALL_SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size_Array = sc.nextInt();
        int[] Array = new int[Size_Array];
        for(int Address = 0; Address < Size_Array; Address++){
            Array[Address] = sc.nextInt();
        }

        int[] Sum_Array = new int[Size_Array];
        for(int Sum_Index = 0;Sum_Index < Size_Array;Sum_Index++) {
            int Sum = 0;
            for (int Address = 0; Address < Size_Array; Address++) {
                if(Sum_Index != Address) {
                    Sum = Sum + Array[Address];
                }
            }
            Sum_Array[Sum_Index] = Sum;
        }
        for(int Index = 0;Index < Size_Array; Index++){
            System.out.print(Sum_Array[Index] + " ");
        }
    }
}
