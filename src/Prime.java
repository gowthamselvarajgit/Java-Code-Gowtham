import java.util.Scanner;


public class Prime {
    public static int checkPrime(int num){
        if (num == 0 || num == 1) {
            return 0;
        }
        else if(num == 2 || num == 3){
            return 1;
        }
        for(int i =2;i<num;i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();
        int result = checkPrime(num);
        if(result == 1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
