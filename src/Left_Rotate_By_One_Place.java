import java.util.Scanner;

public class Left_Rotate_By_One_Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize;Index += 1){
            Array[Index] = sc.nextInt();
         }
        int Temp = Array[0];
        for(int Index = 1; Index < ArraySize; Index += 1){
            Array[Index-1] = Array[Index];
        }
        Array[ArraySize - 1] = Temp;

        for(int Index = 0; Index < ArraySize; Index += 1){
            System.out.print(Array[Index] + " ");
        }
    }
}
