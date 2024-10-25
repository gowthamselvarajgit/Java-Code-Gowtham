import java.util.Arrays;
import java.util.Scanner;

public class LongestSubArrayWithoutDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArray = str.split("\\.");
        int max = Integer.MIN_VALUE;
        for(int index = 0; index < strArray.length; index += 1){
            if(strArray[index].length() > max){
                max = strArray[index].length();
            }
        }
        System.out.println(max);
    }
}
