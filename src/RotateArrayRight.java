import java.util.Scanner;

public class RotateArrayRight {
    public static void rotate(int[] array, int start, int end){
        for(int indexStart  = start, indexEnd = end; indexStart < indexEnd; indexStart += 1,indexEnd-=1){
            int temp = array[indexStart];
            array[indexStart] = array[indexEnd];
            array[indexEnd] = temp;
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
         rotateBy  = rotateBy % arraySize;
         rotate(array,0,arraySize-1);//complete array
         rotate(array, 0, rotateBy-1);//rotate still the rotateby
         rotate(array, rotateBy,arraySize-1);//rotate after rotateby
        for(int index = 0; index < arraySize ; index += 1){
            System.out.print(array[index] + " ");
        }
    }
}
