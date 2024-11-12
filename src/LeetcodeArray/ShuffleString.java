package LeetcodeArray;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int size = sc.nextInt();
        int[] indices = new int[size];
        for (int index = 0; index < size; index++) {
            indices[index] = sc.nextInt();
        }

        char[] jumbledStr = new char[size];
        for (int index = 0; index < size; index++) {
            jumbledStr[indices[index]] = str.charAt(index);
         }
        System.out.println(new String(jumbledStr));
    }
}
