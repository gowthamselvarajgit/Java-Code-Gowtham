import java.util.Scanner;

public class LowerBoundBinary {
    public static int finder(int[] array, int arraySize, int target){
        int low = 0;
        int high = arraySize - 1;
        int ans = arraySize;
        int mid;
        while (low <= high){
            mid = low + (high - low)/2;
            if(array[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int target = scan.nextInt();
        int result = finder(array,arraySize,target);
        System.out.print(result);
    }
}
