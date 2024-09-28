import java.util.Scanner;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }

        int MaximumOne = 0;
        int Count  = 0;
        for(int Index  = 0;Index < ArraySize; Index += 1){
            if(Array[Index] == 1){
                Count = Count + 1;
                MaximumOne = Math.max(Count, MaximumOne);
            }
            else {
                Count = 0;
            }
        }
        System.out.print("Maximum One:" + MaximumOne);
    }
}
