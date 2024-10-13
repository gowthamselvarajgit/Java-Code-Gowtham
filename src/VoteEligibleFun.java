import java.util.Scanner;

public class VoteEligibleFun {
    static String eligible(int age){
        if(age > 18){
            return "Eligible to Vote";
        }
        return "Not Eligible to Vote";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result = eligible(age);
        System.out.println(result);
    }
}
