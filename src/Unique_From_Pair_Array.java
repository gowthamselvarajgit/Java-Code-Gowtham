import java.util.Scanner;
public class Unique_From_Pair_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Array_Size = sc.nextInt();
        int[] Array = new int[Array_Size];
        for (int Index = 0; Index < Array_Size; Index++) {
            Array[Index] = sc.nextInt();
        }
        int Index;
        int Unique_Number;
        for (Index = 0,Unique_Number = 0; Index < Array_Size; Index++) {
                Unique_Number = Unique_Number ^ Array[Index];
    }
        System.out.print(Unique_Number);
    }
}

