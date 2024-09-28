import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] sumFinder(int[] array, int arraySize, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int index = 0; index < arraySize; index += 1){
            int complement = target - array[index];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), index};
            }
            map.put(array[index],index);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] =scan.nextInt();
        }
        int target = scan.nextInt();
        int[] result = sumFinder(array,arraySize,target);
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}
