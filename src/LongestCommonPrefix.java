import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    static String longestPrifix(String[] str){
        if(str == null || str.length == 0) {
            return "-1";
        }
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int minLength = Math.min(first.length(),last.length());
        int index = 0;
        while(index < minLength && first.charAt(index) == last.charAt(index)){
            index += 1;
        }

        if(index == 0)
        {
            return  "-1";
        }
        return first.substring(0,index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strSize = sc.nextInt();
        String[] str = new String[strSize];
        for(int index = 0; index < strSize; index += 1){
            str[index] = sc.next();
        }
        String findSub = longestPrifix(str);
        System.out.print(findSub);

    }
}
