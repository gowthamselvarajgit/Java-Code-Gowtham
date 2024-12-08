import java.util.Scanner;

public class StringPalindrome {
    static boolean paliChecker(String str){
        int start = 0;
        int end = str.length()-1;

        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(paliChecker(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
    }
}
