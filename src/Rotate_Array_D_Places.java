import java.util.Scanner;

public class Rotate_Array_D_Places {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int Number_Of_Rotation = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }
        Number_Of_Rotation = Number_Of_Rotation % ArraySize;
        int[] TempArray = new int[Number_Of_Rotation];
        for(int Index = 0;Index < Number_Of_Rotation; Index+= 1){
            TempArray[Index] = Array[Index];
        }
        for(int Index = Number_Of_Rotation; Index < ArraySize;Index += 1){
            Array[Index - Number_Of_Rotation] = Array[Index];
        }
        int TempIndex = 0;
        for(int Index = ArraySize - Number_Of_Rotation; Index < ArraySize;Index += 1){
            Array[Index] = TempArray[TempIndex];
            TempIndex = TempIndex + 1;
        }
        for(int Index = 0; Index < ArraySize; Index += 1){
            System.out.print(Array[Index] +" ");
        }
    }
}
