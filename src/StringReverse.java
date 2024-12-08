import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        // Reverse the character array
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start += 1;
            end -= 1;
        }

        // Convert the reversed character array back to a string
        String reversedStr = new String(charArray);

        System.out.println("Reversed string: " + reversedStr);
    }
}
