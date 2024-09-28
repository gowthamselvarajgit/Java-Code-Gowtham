import java.util.Scanner;

public class Sorted_Or_Not {
    public static boolean SortedCheck(int[] Array, int ArraySize){
        for(int Index = 1; Index < ArraySize; Index += 1){
            if(Array[Index] < Array[Index-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }
        if(SortedCheck(Array,ArraySize)){
            System.out.print("Sorted");
        }
        else{
            System.out.print("Not Sorted");
        }

    }
}
