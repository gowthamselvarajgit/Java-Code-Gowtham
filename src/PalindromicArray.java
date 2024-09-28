import java.util.Scanner;

public class PalindromicArray {
    public static String palindromeArray(int[] array){
        for(int index = 0; index < array.length; index += 1){
            if(array[index] == -1){
                return "It is not a Palindromic Array";
            }
        }
        return "It is a Palindromic Array";
    }
    public static int palindrome(int number){
        int reverse = 0;
        int copy = number;
        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        if(reverse == copy){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            array[index] = scan.nextInt();
        }
        int[] palindromeChecker = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            int result = palindrome(array[index]);
            palindromeChecker[index] = result;
        }
        String arrayResult = palindromeArray(palindromeChecker);
        System.out.print(arrayResult);
    }
}
