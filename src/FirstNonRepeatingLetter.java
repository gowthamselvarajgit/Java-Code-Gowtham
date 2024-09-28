import java.util.Scanner;

public class FirstNonRepeatingLetter {
    public static char founder(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isNonRepeating = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isNonRepeating = false;
                    break;
                }
            }
            if (isNonRepeating) {
                return str.charAt(i);
            }
        }
        return ' '; // return a default value, e.g., a space
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        char find = founder(str);
        System.out.print(find);
    }
}
