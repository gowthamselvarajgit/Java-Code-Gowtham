import java.util.Scanner;
public class Reverse_Array {
   public static void main(String[] a){
       Scanner sc = new Scanner(System.in);
       int array_size = sc.nextInt();
       int[] array = new int[array_size];
       for (int array_address = 0; array_address < array_size; array_address++){
           array[array_address ] = sc.nextInt();
       }
       int start ;
       int end ;
       for(start = 0,end = array_size-1;start < end;start++,end--){
           int temp = array[start];
           array[start] = array[end];
           array[end] = temp;
       }
       for (int array_address = 0;array_address<array_size;array_address++){
           System.out.print(array[array_address] + " ");
       }
   }
}
