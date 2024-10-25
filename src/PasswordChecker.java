import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        int res = passwordChecker(password);
        System.out.println(res);
    }
    static int passwordChecker(String password){
        int size = password.length();
        int number = 0;
        int capitalLetter = 0;
        if(size < 4){
            return 0;
        }
        for (int index = 0; index < size; index++) {
            char ch = password.charAt(index);
            if(ch == ' ' || ch == '/'){
                return  0;
            }
            if(ch >= '1' && ch <= '9' ){
                number = 1;
            }
            if(ch >= 'A' && ch <= 'Z'){
                capitalLetter = 1;
            }
        }
        if(number == 1 && capitalLetter == 1){
            return 1;
        }
        return 0;
    }
}
