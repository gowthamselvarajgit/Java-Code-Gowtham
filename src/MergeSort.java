import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int array1size = scan.nextInt();
        System.out.print("Enter size of array 2: ");
        int array2size = scan.nextInt();
        System.out.print("Enter array 1: ");
        int[] array1 = new int[array1size];
        for(int index = 0; index <array1size;index+=1){
            array1[index] = scan.nextInt();
        }
        System.out.print("Enter array 2: ");
        int[] array2 = new int[array2size];
        for(int index = 0; index <array2size;index+=1){
            array2[index] = scan.nextInt();
        }
        int mergedArraySize = array1size + array2size;
        int[] mergedArray = new int[mergedArraySize];
        int indexArray1 = 0;
        int indexArray2 = 0;
        int mergedIndex = 0;
        while(indexArray1 < array1size && indexArray2 < array2size){
            if(array1[indexArray1] < array2[indexArray2]){
                mergedArray[mergedIndex++] = array1[indexArray1++];
            }
            else{
                mergedArray[mergedIndex++] = array2[indexArray2++];
            }
        }
        while(array1size > indexArray1){
            mergedArray[mergedIndex++] = array1[indexArray1++];
        }
        while(array2size > indexArray2){
            mergedArray[mergedIndex++] = array2[indexArray2++];
        }
        for(int index = 0; index < mergedArraySize; index += 1){
            System.out.print(mergedArray[index] + " ");
        }
    }
}
