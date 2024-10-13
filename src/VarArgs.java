import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fun(20, 30, 40, 60, 70, 50);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
