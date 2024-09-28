import java.util.Scanner;
public class Sum_Elements_In_Array_V2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Size_Array = sc.nextInt();
        int[] Array = new int[Size_Array];
        for(int Index = 0; Index < Size_Array;Index++){
            Array[Index] = sc.nextInt();
        }
        int Sum = 0;
        for(int Index = 0; Index < Size_Array; Index++){
            Sum = Sum + Array[Index];
        }
        for(int Index = 0;Index < Size_Array;Index++){
            Array[Index] = Sum - Array[Index];
        }
        for (int Index = 0;Index < Size_Array;Index++){
            System.out.print(Array[Index] + " ");
        }
    }
}
