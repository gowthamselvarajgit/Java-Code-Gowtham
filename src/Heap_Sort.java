import java.util.Scanner;
public class Heap_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array_Size = sc.nextInt();
        int[] Array = new int[Array_Size];
        for(int Index = 0; Index < Array_Size;Index++){
            Array[Index] = sc.nextInt();
        }
        heapSort(Array,Array_Size);
        for(int Index = 0;Index < Array_Size;Index++){
            System.out.print(Array[Index] + " ");
        }
    }
    public static void heapSort(int[] Array , int Array_Size){
        int Num_Of_Parents;
        int Parent_Number;
        Num_Of_Parents = Array_Size / 2;
        int Last_Index;
        Last_Index = Array_Size - 1;
        int Temp;
        for(Parent_Number = Num_Of_Parents-1 ;Parent_Number >= 0;Parent_Number--){
            maxHeapify(Array,Parent_Number,Last_Index);
        }

        while(Last_Index != 0){
            Temp = Array[0];
            Array[0] = Array[Last_Index];
            Array[Last_Index] = Temp;
            Last_Index = Last_Index - 1;
            maxHeapify(Array,0,Last_Index);
        }
    }
    public static void maxHeapify(int[] Array, int Parent_Number,int Last_Index){
        int Left_Child = (Parent_Number * 2 ) + 1;
        int Right_Child = (Parent_Number * 2) + 2;
        int Temp;

        //Child
        if(Left_Child > Last_Index){
            return;
        }

        //Parent With Single Child
        if(Left_Child == Last_Index){
            if(Array[Left_Child] > Array[Parent_Number]){
                Temp = Array[Left_Child];
                Array[Left_Child] = Array[Parent_Number];
                Array[Parent_Number] = Temp;
            }
            return;
        }

        //Parent With 2 Child
        if(Array[Left_Child] > Array[Parent_Number] || Array[Right_Child] > Array[Parent_Number]){
            if(Array[Left_Child] > Array[Right_Child]){
                Temp = Array[Left_Child];
                Array[Left_Child] = Array[Parent_Number];
                Array[Parent_Number] = Temp;
                maxHeapify(Array,Left_Child,Last_Index);
            }
            else{
                Temp = Array[Right_Child];
                Array[Right_Child] = Array[Parent_Number];
                Array[Parent_Number] = Temp;
                maxHeapify(Array,Right_Child,Last_Index);
            }
        }
    }
}

