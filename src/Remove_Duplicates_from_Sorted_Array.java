import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        int CopySize = ArraySize;
        for(int Index = 0;Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }


        for(int Index1 = 0; Index1 < ArraySize; Index1 += 1){
            for(int Index2 = Index1 + 1;Index2 < ArraySize;Index2 += 1){
                if(Array[Index1] == Array[Index2]){
                    for(int Index3 = Index2; Index3 < ArraySize-1; Index3+=1){
                        Array[Index3] = Array[Index3+1];
                    }
                    ArraySize = ArraySize - 1;
                    Index2 = Index2 - 1;
                }
            }
        }
        int Size_Finder = ArraySize;
        System.out.print(Size_Finder +",");

        System.out.print("[");
        int Index;
        for(Index = 0; Index < ArraySize; Index += 1){
            System.out.print(Array[Index] + ",");
        }
        for(Index = Index + 1; Index <= CopySize; Index += 1){
            System.out.print("_"+",");
        }
        System.out.print("\b");
        System.out.print("]");
    }
}
