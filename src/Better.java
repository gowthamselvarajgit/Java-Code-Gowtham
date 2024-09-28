import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Better {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index +=1){
            array[index] = scan.nextInt();
        }
        int givenNum = scan.nextInt();
        Map<Long,Integer> prefixSum = new HashMap<Long,Integer>();
        long sum = 0;
        long maxLen = 0;
        for(int index = 0; index < arraySize; index += 1){
            sum = sum  + array[index];
            if(sum == givenNum)
            {
                maxLen = Math.max(maxLen,index += 1);
            }
            long rem = sum - givenNum;
            if(prefixSum.containsKey(rem)){
                int len = index - prefixSum.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum,index);
            }
        }
        System.out.print(maxLen);
    }
}