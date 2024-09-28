import java.util.Scanner;

public class Array_For_Auto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }

        for(int Number : Array){
            System.out.print(Number + " ");
        }
    }
}
