import java.util.Scanner;
public class CountPalindrome {
    public static boolean checkPalindrome(int num){
        int copy = num;
        int rev = 0;
        while(copy != 0){
            int digit = copy % 10;
            rev = rev * 10 + digit;
            copy = copy/10;
        }
        if(rev == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for(int begin = start; begin < end; begin+=1){
            if(checkPalindrome(begin)){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
