package LeetcodeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] candies = new int[size];
        for (int index = 0; index < size; index++) {
            candies[index] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        int maximumCandies = largest(candies);
        ArrayList<Boolean> check = new ArrayList<>();
        for(int index = 0; index < size; index += 1){
            candies[index] = candies[index] + extraCandies;
            if(candies[index] >= maximumCandies){
                check.add(true);
            }
            else{
                check.add(false);
            }
        }
        System.out.println(check);
    }
    static int largest(int[] array){
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if(array[index] > max){
                max = array[index];
            }
        }
        return max;
    }
}
