import java.util.Scanner;

public class NumberofZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for(int index = 0; index < arrSize; index += 1){
            array[index] = sc.nextInt();
        }
        int low  = 0;
        int high = arrSize - 1;
        int firstZero = -1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(array[mid] == 0){
                firstZero = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(firstZero);
        int zeros = arrSize - firstZero;
        System.out.print(zeros);
    }
}
