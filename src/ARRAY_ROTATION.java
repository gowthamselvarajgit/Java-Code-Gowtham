import java.util.Scanner;
public class ARRAY_ROTATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size_Array = sc.nextInt();

        int[] Array = new int[Size_Array];
        for(int Index = 0; Index < Size_Array; Index++){
            Array[Index] = sc.nextInt();
        }


        int Reverse_Factor = sc.nextInt();
        Reverse_Factor = Reverse_Factor % Size_Array;
        for(int IndexStart = 0,IndexEnd = Size_Array - 1; IndexStart < IndexEnd; IndexStart++,IndexEnd--){
            int Temp = Array[IndexStart];
            Array[IndexStart] = Array[IndexEnd];
            Array[IndexEnd]= Temp;
        }
        for(int Index = 0;Index < Size_Array;Index++){
            System.out.print(Array[Index] + " ");
        }
        System.out.println();
        for(int IndexStart = 0,IndexEnd = Reverse_Factor-1;IndexStart < IndexEnd;IndexStart++,IndexEnd--){
            int Temp = Array[IndexStart];
            Array[IndexStart] = Array[IndexEnd];
            Array[IndexEnd]= Temp;
        }
        for(int Index = 0;Index < Size_Array;Index++){
            System.out.print(Array[Index] + " ");
        }
        System.out.println();
        for(int IndexStart = Reverse_Factor,IndexEnd = Size_Array-1;IndexStart < IndexEnd;IndexStart++,IndexEnd--){
            int Temp = Array[IndexStart];
            Array[IndexStart] = Array[IndexEnd];
            Array[IndexEnd]= Temp;
        }
        for(int Index = 0;Index < Size_Array;Index++){
            System.out.print(Array[Index] + " ");
        }
    }
}
