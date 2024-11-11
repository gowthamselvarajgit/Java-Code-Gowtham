import java.util.Scanner;

public class StringPerformanceIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("");
        char ch = 'a';
        for(int index = 1; index <= 26; index += 1){
            name.append(ch);
            ch += 1;
        }
        System.out.println(name);
    }
}
