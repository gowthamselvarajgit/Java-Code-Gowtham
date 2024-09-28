import java.util.Arrays;
import java.util.Scanner;

public class Element_That_Appear_once_Hashing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }

        int Largest = Array[0];
        for(int Index = 0; Index < ArraySize;Index += 1){
            if(Array[Index] > Largest){
                Largest = Array[Index];
            }
        }
        int[] HashingArray = new int[Largest + 1];
        Arrays.fill(HashingArray, 0);

        for(int Index = 0;Index < ArraySize; Index += 1){
            HashingArray[Array[Index]]++;
        }
        int Element = 0;
        for(int Index = 0;Index < ArraySize; Index += 1){
            if(HashingArray[Array[Index]]==1){
                Element = Array[Index];
            }
        }
        System.out.print("Element:" + Element);
    }
}
