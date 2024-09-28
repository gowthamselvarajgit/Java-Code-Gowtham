import java.util.Scanner;

public class Brute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int givenNum = scan.nextInt();
        int largest = 0;
        for(int index1 = 0; index1 < arraySize; index1 += 1){
            for(int index2 = index1; index2 < arraySize; index2 += 1){
                int sum  = 0;
                for(int index3 = index1; index3 <= index2 ; index3 += 1){
                    sum += array[index3];
                }
                if(sum == givenNum)
                    largest = Math.max(largest,index2-index1+1);
            }
        }
        System.out.print(largest);
    }
}
