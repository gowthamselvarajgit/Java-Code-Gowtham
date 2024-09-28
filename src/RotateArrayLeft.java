import java.util.Scanner;

public class RotateArrayLeft {
    public static void  rotate(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int rotateBy = scan.nextInt();
        rotateBy = rotateBy % arraySize;
        rotate(array,0,rotateBy-1);
        rotate(array,rotateBy,arraySize-1);
        rotate(array,0,arraySize-1);
        for(int index = 0; index < arraySize ; index +=1){
            System.out.print(array[index] + " ");
        }
    }

}
