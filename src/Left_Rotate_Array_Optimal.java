import java.util.Scanner;

public class Left_Rotate_Array_Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for (int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }
        int Number_of_Rotate = sc.nextInt();
        Number_of_Rotate = Number_of_Rotate % ArraySize;

        ReverseAnArray(Array,0,Number_of_Rotate-1);
        ReverseAnArray(Array,Number_of_Rotate,ArraySize-1);
        ReverseAnArray(Array,0,ArraySize-1);
        for(int Index = 0; Index < ArraySize;Index += 1){
            System.out.print(Array[Index] +" ");
        }
    }
    public static void ReverseAnArray(int[] Array, int start, int end){
        while (start < end) {
            int Temp = Array[start];
            Array[start] = Array[end];
            Array[end] = Temp;
            start++;
            end--;
        }
    }
}
