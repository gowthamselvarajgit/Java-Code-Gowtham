import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        char ch;

        for(int index = 0; index < str.length(); index += 1){
            ch = str.charAt(index);
            rev = ch + rev;
        }
        System.out.print(rev);
    }
}
