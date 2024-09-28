import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < size; index+=1){
            array[index] = sc.nextInt();
        }
        int pointer = 1;
        while(pointer<size-1){
            if(array[pointer]>array[pointer-1] && array[pointer] > array[pointer+1]){
                System.out.print(array[pointer]);
            }
            pointer += 1;
        }
    }
}
