import java.util.Scanner;

public class Move_Zeros_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();

        int[] Array = new int[ArraySize];
        for(int Index = 0; Index < ArraySize; Index += 1){
            Array[Index] = sc.nextInt();
        }
        int StartZero = -1;
        for(int Zerocheck = 0; Zerocheck < ArraySize; Zerocheck += 1){
            if(Array[Zerocheck] == 0){
                StartZero = Zerocheck;
                break;
            }
        }
        if(StartZero == -1){
            System.out.print("NO ZERO");
        }
        else {
            for (int ZeroMover = StartZero + 1; ZeroMover < ArraySize; ZeroMover += 1) {
                if (Array[ZeroMover] != 0) {
                    int temp = Array[StartZero];
                    Array[StartZero] = Array[ZeroMover];
                    Array[ZeroMover] = temp;
                    StartZero = StartZero + 1;
                }
            }
            for (int Index = 0; Index < ArraySize; Index += 1) {
                System.out.print(Array[Index] + " ");
            }
        }
    }
}
