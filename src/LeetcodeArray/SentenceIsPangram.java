package LeetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceIsPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean[] filler = new boolean[26];
        char[] charArray = str.toCharArray();
        for(int index = 0; index < charArray.length; index += 1){
            filler[charArray[index] - 'a'] = true;
        }
        if(check(filler)){
            System.out.println("It is a Pangram");
        }
        else{
            System.out.println("Not a pangram");
        }

        System.out.println(Arrays.toString(filler));
    }
    static boolean check(boolean[] array){
        for (int index = 0; index < array.length; index++) {
            if(!array[index]){
                return  false;
            }
        }
        return true;
    }
}
