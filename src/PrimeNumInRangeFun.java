import java.util.Scanner;

public class PrimeNumInRangeFun {
    static boolean primeCheck(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i * i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int num = start; num <= end; num += 1){
            if(primeCheck(num)){
                System.out.print(num +" ");
            }
        }
    }
}
