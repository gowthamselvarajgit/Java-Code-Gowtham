import java.util.Scanner;

public class Closest_To_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array_Size = sc.nextInt();
        int[] Array = new int[Array_Size];
        for (int Index = 0; Index < Array_Size; Index += 1) {
            Array[Index] = sc.nextInt();
        }
        int Near = 0;
        int Minimum = Integer.MAX_VALUE;
        for(int Index = 0;Index < Array_Size;Index+=1){
            if(Minimum > Math.abs(Array[Index]) || Minimum == Array[Index]){
                Minimum = Math.abs(Array[Index]);
                Near = Array[Index];
            }
        }
        System.out.println(Near);
    }
}
