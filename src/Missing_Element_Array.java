import java.util.Scanner;

public class Missing_Element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }
        int Sum_of_Natural;
        Sum_of_Natural = (ArraySize * (ArraySize + 1))/2;

        int ArraySummer = 0;
        for(int Index = 0; Index < ArraySize; Index += 1){
            ArraySummer = ArraySummer + Array[Index];
        }

        int MissingNumber = Sum_of_Natural - ArraySummer;
        System.out.print("Missing : " + MissingNumber);
    }
}
